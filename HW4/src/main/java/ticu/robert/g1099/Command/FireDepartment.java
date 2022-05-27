package ticu.robert.g1099.Command;

import java.util.ArrayList;

public class FireDepartment {

    public ArrayList<RedCodeInterface> actions;
    String address;

    public FireDepartment(String address) {
        this.actions = new ArrayList<>();
        this.address = address;
    }

    public void addAction(RedCodeInterface action){
        this.actions.add(action);
    }

    public void getNotification(){
        for(RedCodeInterface action : actions){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    action.takeAction();
                }
            }).start();
        }

        this.actions.clear();
    }
}
