package ticu.robert.g1099.Strategy;

import ticu.robert.g1099.AbstractWeatherStation;
import ticu.robert.g1099.WeatherClientInterface;

public class InfoWeatherStation extends AbstractWeatherStation {

    protected InformationInterface sendStrategy;

    public void setStrategy(InformationInterface info){
        this.sendStrategy = info;
    }

    public void sendData(){
        if(sendStrategy != null) {
            sendStrategy.sendInfo();
        }
        else throw new UnsupportedOperationException();

    }

    @Override
    public void connectToSensor() {

    }

    @Override
    public void readSensorData() {

    }

    @Override
    public void storeSensorData() {

    }

    @Override
    public void publishSensorData() {

    }
}
