package ticu.robert.g1099.Observer;

public class LocalAlert implements Handler{
    @Override
    public void reactToData() {
        System.out.println("The local alerting station got the data!");
    }
}
