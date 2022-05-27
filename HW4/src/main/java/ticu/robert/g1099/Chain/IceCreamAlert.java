package ticu.robert.g1099.Chain;

import ticu.robert.g1099.WeatherClientInterface;

public class IceCreamAlert extends Handler{
    @Override
    public void manageRequest(WeatherClientInterface weatherInfo) {
        BasicWeatherClient info = null;
        if(weatherInfo instanceof BasicWeatherClient)
             info = (BasicWeatherClient)weatherInfo;

        if (info.airHumidity<0.3 && info.windSpeed<5 && info.airTemp>39){
            System.out.println("Notify the ice cream department");
        }

        if(this.successor!= null)
            this.successor.manageRequest(weatherInfo);
    }
}
