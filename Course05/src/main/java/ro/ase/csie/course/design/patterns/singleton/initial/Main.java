package ro.ase.csie.course.design.patterns.singleton.initial;

public class Main {
    public static void main(String[] args) {
        DBConnection dbConnection = new DBConnection("127.0.0.1", 3306, "university");
        CoursesModule coursesModule = new CoursesModule(dbConnection);
        UsersModule usersModule = new UsersModule(dbConnection);
    }
}
