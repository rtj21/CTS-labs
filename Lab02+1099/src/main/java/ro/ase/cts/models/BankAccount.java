package ro.ase.cts.models;

import ro.ase.cts.exceptions.IllegalTransferException;
import ro.ase.cts.exceptions.InsufficientFundsException;

public abstract class BankAccount extends Account {

    protected double balance;
    protected final String iban;

    public BankAccount(String iban) {
        this.iban = iban;
    }



    @Override
    public void deposit(double amount) throws IllegalTransferException {
        if(amount <= 0) {
            throw new IllegalTransferException();
        }
        this.balance+=amount;
    }

    @Override
    public void withdraw(double amount) throws IllegalTransferException, InsufficientFundsException {
        if(amount <= 0) {
            throw new IllegalTransferException();
        }
        if(amount > this.balance){
            throw new InsufficientFundsException();
        }
        this.balance-=amount;
    }

    @Override
    public void transfer(Account destination, double amount) throws IllegalTransferException, InsufficientFundsException {
        this.withdraw(amount);
        try {
            this.deposit(amount);
        } catch(Exception e){
            this.deposit(amount);
        }
    }

    @Override
    public double getBalance() {
        return this.balance;
    }
}
