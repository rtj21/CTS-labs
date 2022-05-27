package ticu.robert.g1099.Chain;

import ticu.robert.g1099.WeatherClientInterface;

public class PossibleWildfireAlert extends Handler{
    @Override
    public void manageRequest(WeatherClientInterface weatherInfo) {
        BasicWeatherClient info = null;
        if(weatherInfo instanceof BasicWeatherClient)
             info = (BasicWeatherClient)weatherInfo;

        if (info.airHumidity<0.3 && info.windSpeed>30 && info.airTemp>=39){
            System.out.println("Alert local fire department for potential wildfire");
        }

        if(this.successor!= null)
            this.successor.manageRequest(weatherInfo);
    }
}
