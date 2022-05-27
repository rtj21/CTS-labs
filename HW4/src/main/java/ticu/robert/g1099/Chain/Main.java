package ticu.robert.g1099.Chain;

public class Main {
    public static void main(String[] args) {

        BasicWeatherClient weather = new BasicWeatherClient(0.25f,45,60,"Barcelona");
        PossibleWildfireAlert wildfire = new PossibleWildfireAlert();
        IceCreamAlert iceCreamAlert = new IceCreamAlert();
        LowTempsAlert lowTempsAlert = new LowTempsAlert();
        StormAlert stormAlert = new StormAlert();

        wildfire.setSuccessor(lowTempsAlert);
        lowTempsAlert.setSuccessor(stormAlert);
        stormAlert.setSuccessor(iceCreamAlert);

        Handler handler = wildfire;
        handler.manageRequest(weather);
        weather.windSpeed=3;
        weather.airHumidity = 0.2f;
        weather.airTemp=60;

        handler.manageRequest(weather);

        weather.airTemp = -100;
        weather.windSpeed = 300;

        handler.manageRequest(weather);
    }
}
