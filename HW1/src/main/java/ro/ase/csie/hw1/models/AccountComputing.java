package ro.ase.csie.hw1.models;

import ro.ase.csie.hw1.interfaces.IAccountable;

public class AccountComputing implements IAccountable {
    private static final float BROKER_FEE = 0.0125f;
    public static float DAYS_IN_YEAR = 365;

    @Override
    public double getMonthlyRate(int loanValue, int rate) {
        return loanValue * rate;
    }

    public double computeFee(double loanValue, double rate, int daysActive){
        return (BROKER_FEE * loanValue * (Math.pow(rate, (daysActive / DAYS_IN_YEAR)) - 1));
    }

}
