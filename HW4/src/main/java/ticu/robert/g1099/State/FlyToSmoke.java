package ticu.robert.g1099.State;

public class FlyToSmoke implements DroneState {
    String location;

    public FlyToSmoke(String location) {
        this.location = location;
    }

    @Override
    public void navigate() {
        System.out.println("Flying to location "+this.location+" where smoke was detected.");
    }
}
