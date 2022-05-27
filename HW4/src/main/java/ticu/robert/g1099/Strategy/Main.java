package ticu.robert.g1099.Strategy;

public class Main {
    public static void main(String[] args) {
        InfoWeatherStation weather = new InfoWeatherStation();
        weather.setStrategy(new RESTInfo("localhost:3000"));
        weather.sendData();

        weather.setStrategy(new SMSInfo("0722222222"));
        weather.sendData();

        weather.setStrategy(new WebInfo("www.acs.ase.ro"));
        weather.sendData();
    }
}
