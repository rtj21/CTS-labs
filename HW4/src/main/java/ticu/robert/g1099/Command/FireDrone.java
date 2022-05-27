package ticu.robert.g1099.Command;

public class FireDrone implements RedCodeInterface{
    String name;
    boolean hasVideoFeed;

    public FireDrone(String name, boolean hasVideoFeed) {
        this.name = name;
        this.hasVideoFeed = hasVideoFeed;
    }

    @Override
    public void takeAction() {
        System.out.println("The drone "+this.name+" has been dispatched to the incident location.");
        if(hasVideoFeed == true){
            System.out.println("It has video feed and is transmitting it live.");
        }
        else System.out.println("The drone does not have live camera feed, but is equipped with a small extinguisher.");
    }
}
