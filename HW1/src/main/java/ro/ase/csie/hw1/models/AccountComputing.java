package ro.ase.csie.hw1.models;

import ro.ase.csie.hw1.interfaces.IAccountable;

public class AccountComputing implements IAccountable {

    @Override
    public double getMonthlyRate(Account account) {
        return account.getLoanValue() * account.getRate();
    }


}
