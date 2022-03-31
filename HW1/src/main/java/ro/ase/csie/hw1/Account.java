package ro.ase.csie.hw1;

public class Account {
    public static final int STANDARD = 0, BUDGET = 1, PREMIUM = 2, SUPER_PREMIUM = 3;
    public double loanValue, rate;
    public int daysActive, accountType;

    public Account(double loanValue, double rate, int accountType) throws Exception {
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
        int temp = 365;
        for (int i = 0; i < accounts.length; i++) {
            account = accounts[i];
            if (account.accountType == Account.PREMIUM || account.accountType == Account.SUPER_PREMIUM)
                totalFee += .0125 * (    //	1.25%	broker's	fee
                        account.loanValue * Math.pow(account.rate, (account.daysActive / 365)) - account.loanValue);    //	interest-principal
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

    //must have method - the lead has requested it in all classes
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
        int vb = 10;
        System.out.println("This is an account");
    }


}
