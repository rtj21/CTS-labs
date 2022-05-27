package ticu.robert.g1099.Chain;

import ticu.robert.g1099.WeatherClientInterface;

public abstract class Handler {
    protected Handler successor = null;

    public void setSuccessor(Handler successor){
        this.successor = successor;
    }

    public abstract void manageRequest(WeatherClientInterface weatherInfo);
}
