package ticu.robert.g1099.Chain;

import ticu.robert.g1099.WeatherClientInterface;

public class BasicWeatherClient implements WeatherClientInterface {
    public float airHumidity;
    public int airTemp;
    public int windSpeed;
    public String city;

    public BasicWeatherClient(float airHumidity, int airTemp, int windSpeed, String city) {
        this.airHumidity = airHumidity;
        this.airTemp = airTemp;
        this.windSpeed = windSpeed;
        this.city = city;
    }

    @Override
    public void getWeatherInfo() {
        System.out.println("Getting data for the city "+this.city);
        System.out.println("Air temperature: "+ this.airTemp);
        System.out.println("Air humidity: "+ this.airHumidity);
        System.out.println("Wind speed: "+ this.windSpeed);
    }
}
