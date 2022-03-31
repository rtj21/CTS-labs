package ro.ase.csie.cts.g1099.design.patterns.singleton;

public class Main {
    public static void main(String[] args) {

        DBConnection mysql1 = DBConnection.getConnection();
        DBConnection mysql2 = DBConnection.getConnection();

        if(mysql1 == mysql2)
            System.out.println("miau");
    }
}
