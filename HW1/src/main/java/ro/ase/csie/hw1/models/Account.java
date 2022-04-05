package ro.ase.csie.hw1.models;

import ro.ase.csie.hw1.Exceptions.InvalidDaysActiveValueException;
import ro.ase.csie.hw1.Exceptions.InvalidLoanValueException;
import ro.ase.csie.hw1.interfaces.IAccountable;

public class Account {

    private double loanValue, rate;
    private int daysActive;
    private AccountType accountType;

    private IAccountable iAccountable;

    public Account(double loanValue, double rate, AccountType accountType) throws Exception {
        if (loanValue < 0)
            throw new InvalidLoanValueException();

        this.loanValue = loanValue;
        this.rate = rate;
        this.accountType = accountType;
    }

    public double getRate() {
        return this.rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getDaysActive() {
        return daysActive;
    }

    public void setDaysActive(int daysActive) {
        if (daysActive < 0)
            throw new InvalidDaysActiveValueException();
        this.daysActive = daysActive;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public IAccountable getiAccountable() {
        return iAccountable;
    }

    public void setiAccountable(IAccountable iAccountable) {
        this.iAccountable = iAccountable;
    }


    public double getLoanValue() {
        return loanValue;
    }

    public void setLoanValue(double loanValue) throws Exception {
        if (loanValue < 0)
            throw new InvalidLoanValueException();

        this.loanValue = loanValue;
    }

    @Override
    public String toString() {
        return "Loan: " + this.loanValue + "; rate: " + this.rate +
                "; days active:" + daysActive + "; Type: " + accountType + ";";
    }





}
