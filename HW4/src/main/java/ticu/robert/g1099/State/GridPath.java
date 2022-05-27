package ticu.robert.g1099.State;

public class GridPath implements DroneState {

    Drone drone;

    boolean smokeDetected;

    public GridPath(Drone drone, boolean smokeDetected) {

        this.smokeDetected = smokeDetected;
        this.drone = drone;
    }

    @Override
    public void navigate() {
        System.out.println("Drone is flying in a grid path and is checking for smoke");

        if(smokeDetected == true) {
            System.out.println("Smoke detected. Switching strategy.");
            drone.setStrategy(new FlyToSmoke("x:251 y:3853 z:10"));
            drone.navigate();
        }
    }
}
