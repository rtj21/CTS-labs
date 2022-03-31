package ro.ase.csie.hw1;

public class Account implements IAccountable {

    public double loanValue, rate;
    public int daysActive;
    AccountType accountType;
    private static float BROKER_FEE = 0.0125f;
    public static float DAYS_IN_YEAR = 365;

    public Account(double loanValue, double rate, AccountType accountType) throws Exception {
        if (loanValue < 0)
            throw new Exception();
        else {
            this.loanValue = loanValue;
        }
        this.rate = rate;
        this.accountType = accountType;
    }

    public static double computeTotalFee(Account[] accounts) {
        double totalFee = 0.0;
        Account account;

        for (int i = 0; i < accounts.length; i++) {
            account = accounts[i];
            if (account.accountType == AccountType.PREMIUM || account.accountType == AccountType.SUPER_PREMIUM)
                totalFee += BROKER_FEE * (account.loanValue * Math.pow(account.rate, (account.daysActive / DAYS_IN_YEAR))
                        - account.loanValue);    //	interest-principal
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

    @Override
    public double getMonthlyRate() {
        return loanValue * rate;
    }

    public void setLoanValue(double loanValue) throws Exception {
        if (loanValue < 0)
            throw new Exception();
        else {
            this.loanValue = loanValue;
        }
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
