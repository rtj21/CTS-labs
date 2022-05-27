package ticu.robert.g1099.Command;

public class FireTruck implements RedCodeInterface{
    String code;
    String driver;

    public FireTruck(String code, String driver) {
        this.code = code;
        this.driver = driver;
    }

    @Override
    public void takeAction() {
        System.out.println("The Firetruck #"+this.code+" is being filled up with water by "+this.driver);
    }
}
