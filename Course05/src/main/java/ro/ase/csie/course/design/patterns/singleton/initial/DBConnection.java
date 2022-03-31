package ro.ase.csie.course.design.patterns.singleton.initial;

public class DBConnection {
    String serverIP;
    int serverPort;
    String database;

    public DBConnection(String serverIP, int serverPort, String database) {
        this.serverIP = serverIP;
        this.serverPort = serverPort;
        this.database = database;
    }
    public void connect(){
        System.out.println("connecting to " + this.serverIP);
    }
}
