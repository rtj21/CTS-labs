package ticu.robert.g1099.Observer;

public class LocalMeteo implements Handler{
    @Override
    public void reactToData() {
        System.out.println("The local meteo station got the data!");
    }
}
