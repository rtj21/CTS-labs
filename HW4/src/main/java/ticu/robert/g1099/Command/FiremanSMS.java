package ticu.robert.g1099.Command;

public class FiremanSMS implements RedCodeInterface{
    String message;

    public FiremanSMS(String message) {
        this.message = message;
    }

    @Override
    public void takeAction() {
        System.out.println("The firemen were notified of: " +this.message);
    }
}
