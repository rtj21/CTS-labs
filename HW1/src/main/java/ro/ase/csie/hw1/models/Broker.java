package ro.ase.csie.hw1.models;

public class Broker {
    private static float DAYS_IN_YEAR = 365;

    private float brokerFee = 0.0125f;

    public double computeAccountsTotalFee(Account[] accounts) {
        double totalFee = 0.0;

        for (Account account : accounts) {
            if (account.getAccountType().hasFees())
                totalFee += computeFee(account);
        }
        return totalFee;
    }

    public double computeFee(Account account){
        return (this.brokerFee * account.getLoanValue() *
                (Math.pow(account.getRate(), (account.getDaysActive() / DAYS_IN_YEAR)) - 1));
    }
}
