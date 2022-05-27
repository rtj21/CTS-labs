package ticu.robert.g1099.State;


public class Drone {
    String name;
    DroneState flyingState;

    public Drone(String name) {
        this.name = name;
    }

    public void setStrategy(DroneState strategy){
        this.flyingState = strategy;
    }

    public void navigate(){
        if(flyingState != null)
            flyingState.navigate();
        else throw new UnsupportedOperationException();

    }
}
