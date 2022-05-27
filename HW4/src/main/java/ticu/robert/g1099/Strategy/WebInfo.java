package ticu.robert.g1099.Strategy;

public class WebInfo implements InformationInterface{
    String webAddress;

    public WebInfo(String webAddress) {
        this.webAddress = webAddress;
    }

    @Override
    public void sendInfo() {
        System.out.println("Sending info to website "+this.webAddress);
    }
}
