package ro.ase.csie.hw1;

public class Account implements IAccountable {

    public double loanValue, rate;
    public int daysActive;
    AccountType accountType;
    private static float BROKER_FEE = 0.0125f;
    public static float DAYS_IN_YEAR = 365;

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
            if (account.accountType == AccountType.PREMIUM || account.accountType == AccountType.SUPER_PREMIUM)
                totalFee += account.computeFee();
        }
        return totalFee;
    }

    public double computeFee(){
        return (BROKER_FEE * this.loanValue * (Math.pow(this.rate, (this.daysActive / DAYS_IN_YEAR)) - 1));
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
