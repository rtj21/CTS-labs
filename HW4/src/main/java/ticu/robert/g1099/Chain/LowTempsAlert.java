package ticu.robert.g1099.Chain;

import ticu.robert.g1099.WeatherClientInterface;

public class LowTempsAlert extends Handler{
    @Override
    public void manageRequest(WeatherClientInterface weatherInfo) {
        BasicWeatherClient info = null;
        if(weatherInfo instanceof BasicWeatherClient)
             info = (BasicWeatherClient)weatherInfo;

        if (info.airTemp<-15){
            System.out.println("Alert people to stay at home");
        }

        if(this.successor!= null)
            this.successor.manageRequest(weatherInfo);
    }
}
