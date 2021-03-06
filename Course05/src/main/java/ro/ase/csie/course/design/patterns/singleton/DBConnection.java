package ro.ase.csie.course.design.patterns.singleton;

public class DBConnection {
    String serverIP;
    int serverPort;
    String database;
    private static DBConnection connection = null;
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
        if(DBConnection.connection == null){
            DBConnection.connection = new DBConnection("127.0.0.1", 3306, "university");
        }
        return DBConnection.connection;
    }

    public static DBConnection getConnection(String ip, int port, String database){
        if(DBConnection.connection == null){
            DBConnection.connection = new DBConnection(ip,port,database);
        }
        return DBConnection.connection;
    }
}
