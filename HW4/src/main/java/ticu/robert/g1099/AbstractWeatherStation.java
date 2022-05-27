package ticu.robert.g1099;

public abstract class AbstractWeatherStation {
    String data;

    public abstract void connectToSensor();
    public abstract void readSensorData();
    public abstract void storeSensorData();
    public abstract void publishSensorData();
}
