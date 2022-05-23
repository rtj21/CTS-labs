package ticu.robert.g1099.Template;

public class LakeWeatherStation extends TemplateWeatherStation{
    @Override
    public void connectToSensor() {
        System.out.println("connecting to LAKE sensor...");
    }

    @Override
    public void readSensorData() {
        System.out.println("reading data from LAKE sensor...");
    }

    @Override
    public void storeSensorData() {
        System.out.println("storing LAKE sensor data...");
    }

    @Override
    public void publishSensorData() {
        System.out.println("publishing LAKE sensor data...");
    }
}
