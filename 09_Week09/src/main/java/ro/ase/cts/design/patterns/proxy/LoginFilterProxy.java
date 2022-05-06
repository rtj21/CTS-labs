package ro.ase.cts.design.patterns.proxy;

import java.util.HashMap;

public class LoginFilterProxy implements LoginInterface {

    int attemptsLimit;
    private LoginInterface loginModule;
    HashMap<String,Integer> loginCounter = new HashMap<>();


    public LoginFilterProxy(LoginInterface loginModule, int attemptsLimit){
        super();
        this.loginModule = loginModule;
        this.attemptsLimit = attemptsLimit;
    }

    @Override
    public boolean checkCredentials(String username, String password) {

        Integer noAttempts = loginCounter.get(username);
        if(noAttempts == null){
            loginCounter.put(username,0);
            noAttempts = 0;
        }

        if(noAttempts >= attemptsLimit){
            System.out.println("Notify user...");
            return false;
        }
        boolean isOk = this.loginModule.checkCredentials(username, password);
        if(!isOk){
            noAttempts +=1;
            loginCounter.put(username,noAttempts);
        }
        return isOk;
    }
}
