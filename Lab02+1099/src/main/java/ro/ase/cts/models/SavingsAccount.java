package ro.ase.cts.models;

import ro.ase.cts.exceptions.IllegalTransferException;
import ro.ase.cts.exceptions.InsufficientFundsException;

public class SavingsAccount extends BankAccount {
    public static final double MIN_BALANCE = 100;

    public SavingsAccount(String iban) throws IllegalTransferException {
        super(iban);
        this.deposit(SavingsAccount.MIN_BALANCE);
    }

    @Override
    public void withdraw(double amount) throws IllegalTransferException, InsufficientFundsException {
        if(amount < this.balance-SavingsAccount.MIN_BALANCE)
            throw new InsufficientFundsException();

        super.withdraw(amount);
    }


}
