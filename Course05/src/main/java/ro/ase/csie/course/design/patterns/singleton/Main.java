package ro.ase.csie.course.design.patterns.singleton;

public class Main {
    public static void main(String[] args) {

        DBConnection db1 = DBConnection.getConnection();
        DBConnection db2 = DBConnection.getConnection();

        if (db1==db2)
            System.out.println("miau");

    }

}
