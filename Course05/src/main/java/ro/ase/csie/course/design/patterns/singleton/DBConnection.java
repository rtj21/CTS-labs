package ro.ase.csie.course.design.patterns.singleton;

public class DBConnection {
    String serverIP;
    int serverPort;
    String database;
    private static DBConnection connection = null;

    private DBConnection(String serverIP, int serverPort, String database) {
        this.serverIP = serverIP;
        this.serverPort = serverPort;
        this.database = database;
    }
    public void connect(){
        System.out.println("connecting to " + this.serverIP);
    }

    public static DBConnection getConnection(){
        if(DBConnection.connection == null){
            DBConnection.connection = new DBConnection("127.0.0.1", 3306, "university");
        }
        return DBConnection.connection;
    }
}
