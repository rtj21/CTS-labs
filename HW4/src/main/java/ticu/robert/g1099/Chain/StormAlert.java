package ticu.robert.g1099.Chain;

import ticu.robert.g1099.WeatherClientInterface;

public class StormAlert extends Handler{
    @Override
    public void manageRequest(WeatherClientInterface weatherInfo) {
        BasicWeatherClient info = null;
        if(weatherInfo instanceof BasicWeatherClient)
             info = (BasicWeatherClient)weatherInfo;

        if (info.windSpeed>=90){
            System.out.println("Alert people that there is a storm");
        }

        if(this.successor!= null)
            this.successor.manageRequest(weatherInfo);
    }
}
