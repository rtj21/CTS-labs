package ticu.robert.g1099.Command;

public class Main {
    public static void main(String[] args) {
        FireDepartment fireDepartment = new FireDepartment("Strada Lascar Catargiu 24");

        boolean hasVideoFeed = true;

        fireDepartment.addAction(new FiremanSMS("fire in the building 09272!!!"));
        fireDepartment.addAction((new FireDrone("Phaze03Ysh7",hasVideoFeed)));
        fireDepartment.addAction(new FireTruck("FR3372R", "Johnny Pedd"));

        fireDepartment.getNotification();
    }
}
