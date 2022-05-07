package TicuJianu.Robert.g1100.Singleton.Models;

public class SnykConnection {

    public String authToken;
    public String username;
    public SnykAppType appType;

    boolean isTesting = false;

    private static final SnykConnection connection =
            new SnykConnection("av646-h367sg1-2484kd-hg78","rtj21", SnykAppType.Jenkinsfile);

    public synchronized static SnykConnection getConnection(){
        return SnykConnection.connection;
    }

    private SnykConnection(){

    }

    private SnykConnection(String authToken, String username, SnykAppType appType) {
        this.authToken = authToken;
        this.username = username;
        this.appType = appType;
    }

    public void testApp(){
        if(isTesting==false){
            System.out.println("Testing a "+ this.appType.name()+" for user: "+this.username);
            this.isTesting=true;
        }
        else{
            System.out.println("There is already an app being tested.");
        }
    }
}
