package ticu.robert.g1099.Template;

import ticu.robert.g1099.AbstractWeatherStation;

public abstract class TemplateWeatherStation extends AbstractWeatherStation {

    public final void collectData(){
        connectToSensor();
        readSensorData();
        storeSensorData();
        publishSensorData();
    }
}
