package ticu.robert.g1099;

public abstract class AbstractWeatherStation {
    public abstract void connectToSensor();
    public abstract void readSensorData();
    public abstract void storeSensorData();
    public abstract void publishSensorData();
}
