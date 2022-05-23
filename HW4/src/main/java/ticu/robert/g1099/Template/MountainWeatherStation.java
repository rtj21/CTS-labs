package ticu.robert.g1099.Template;

public class MountainWeatherStation extends TemplateWeatherStation{
    @Override
    public void connectToSensor() {
        System.out.println("connecting to MOUNTAIN sensor...");
    }

    @Override
    public void readSensorData() {
        System.out.println("reading data from MOUNTAIN sensor...");
    }

    @Override
    public void storeSensorData() {
        System.out.println("storing MOUNTAIN sensor data...");
    }

    @Override
    public void publishSensorData() {
        System.out.println("publishing MOUNTAIN sensor data...");
    }
}
