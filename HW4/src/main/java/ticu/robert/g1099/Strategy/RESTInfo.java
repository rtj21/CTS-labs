package ticu.robert.g1099.Strategy;

public class RESTInfo implements  InformationInterface{
    String serverLink;

    public RESTInfo(String serverLink) {
        this.serverLink = serverLink;
    }

    @Override
    public void sendInfo() {
        System.out.println("Sending info to REST service "+this.serverLink);
    }
}
