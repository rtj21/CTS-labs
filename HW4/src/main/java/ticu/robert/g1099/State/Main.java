package ticu.robert.g1099.State;

public class Main {
    public static void main(String[] args) {
        Drone drone = new Drone("X330TY");
        drone.setStrategy(new GridPath(drone, true));
        drone.navigate();
    }
}
