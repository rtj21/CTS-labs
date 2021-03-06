package ro.ase.cts.models;

public class CurrentAccount extends BankAccount {
    public static final double MAX_CREDIT = 10000;

    public CurrentAccount(String iban) {
        super(iban);
        this.balance = CurrentAccount.MAX_CREDIT;
    }
}
