package ro.ase.csie.cts.g1099.design.patterns.singleton;

public class DBConnection {
    private static DBConnection connection;
    public String connectionString;
    private String database;
    private String username;

    private DBConnection(String connectionString, String database, String username) {
        this.connectionString = connectionString;
        this.database = database;
        this.username = username;
    }

    private DBConnection() {
    }

    public synchronized static DBConnection getConnection(){
        if(connection == null){
            connection = new DBConnection();
        }
        return connection;
    }
}
