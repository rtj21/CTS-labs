package ticu.robert.g1099.Observer;

public class Main {
    public static void main(String[] args) {
        CentralWeatherStation centralWeatherStation = new CentralWeatherStation();
        LocalAlert localAlert = new LocalAlert();
        LocalMeteo localMeteo = new LocalMeteo();
        LocalMeteo localMeteo1 = new LocalMeteo();
        WeatherMobileApp weatherMobileApp = new WeatherMobileApp();

        centralWeatherStation.registerClient(localAlert);
        centralWeatherStation.registerClient(localMeteo);
        centralWeatherStation.registerClient(localMeteo1);
        centralWeatherStation.registerClient(weatherMobileApp);

        centralWeatherStation.notifyClients();

        centralWeatherStation.unregisterClient(localMeteo1);
        centralWeatherStation.notifyClients();

    }
}
