package ro.ase.csie.course.design.patterns.singleton.initial;

public class CoursesModule {
    DBConnection dbConnection = new DBConnection("127.0.0.1", 3306, "university");

    public CoursesModule(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
        dbConnection.connect();
    }
}
