package ro.ase.csie.hw1.models;

import ro.ase.csie.hw1.Exceptions.InvalidLoanValueException;
import ro.ase.csie.hw1.interfaces.IAccountable;

public class Account  {



    public double loanValue, rate;
    public int daysActive;
    AccountType accountType;
    AccountComputing accountComputing;

    public Account(double loanValue, double rate, AccountType accountType) throws Exception {
        if (loanValue < 0)
            throw new InvalidLoanValueException();

        this.loanValue = loanValue;
        this.rate = rate;
        this.accountType = accountType;
    }

    public static double computeAccountsTotalFee(Account[] accounts) {
        double totalFee = 0.0;

        for (Account account : accounts) {
            if (account.accountType.hasFees())
                totalFee += account.accountComputing.computeFee(account.loanValue, account.rate, account.daysActive);
        }
        return totalFee;
    }



    public double getLoanValue() {
        System.out.println("The loan value is " + this.loanValue);
        return loanValue;
    }

    public double getRate() {
        System.out.println("The rate is " + rate);
        return this.rate;
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


    public void printAccount() {
        System.out.println("This is an account");
    }


}
