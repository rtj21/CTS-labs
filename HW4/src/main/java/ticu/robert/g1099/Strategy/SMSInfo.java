package ticu.robert.g1099.Strategy;

public class SMSInfo implements InformationInterface{

    String phoneNo;

    public SMSInfo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public void sendInfo() {
        System.out.println("Sending info to phone no "+this.phoneNo);
    }
}
