package ro.ase.csie.hw1.models;

import ro.ase.csie.hw1.interfaces.IAccountable;

public class AccountComputing implements IAccountable {

    @Override
    public double getMonthlyRate(int loanValue, int rate) {
        return loanValue * rate;
    }


}
