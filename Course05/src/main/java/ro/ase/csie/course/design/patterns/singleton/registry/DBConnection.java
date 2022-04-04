package ro.ase.csie.course.design.patterns.singleton.registry;

import java.util.HashMap;

public class DBConnection {

    //singleton registry/dictionary
    private static HashMap<String, DBConnection> connections = new HashMap<>();
    String serverIP;
    int serverPort;
    String database;
    boolean isOpen = false;

    private DBConnection(String serverIP, int serverPort, String database) {
        this.serverIP = serverIP;
        this.serverPort = serverPort;
        this.database = database;
    }
    public void connect(){
        if(!isOpen) {
            System.out.println("connecting to " + this.serverIP);
            this.isOpen = true;
        }
        else{
            System.out.println("You are already connected to" + this.serverIP);
        }

    }

    public static DBConnection getConnection(){
        String defaultIp = "127.0.0.1";
        DBConnection connection = connections.get(defaultIp);

        if(connection == null){
            connection = new DBConnection("127.0.0.1", 3306, "university");
        }
        return connection;
    }

    public static DBConnection getConnection(String ip, int port, String database){
        String defaultIp = "127.0.0.1";
        DBConnection connection = connections.get(ip);

        if(connection == null){
            connection = new DBConnection(ip,port,database);
        }
        return connection;
    }
}
