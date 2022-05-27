package ticu.robert.g1099.Observer;

public class WeatherMobileApp implements Handler{
    @Override
    public void reactToData() {
        System.out.println("The weather mobile app got the data!");
    }
}
