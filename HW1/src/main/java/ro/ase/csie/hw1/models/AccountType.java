package ro.ase.csie.hw1.models;

public enum AccountType {

    STANDARD(0,false), BUDGET(1, false),PREMIUM(2,true), SUPER_PREMIUM(3,true);

    private int id;
    private boolean fees;
    AccountType(int id, boolean fees) {
        this.id=id;
        this.fees = fees;
    }

    public boolean hasFees() {
        return fees;
    }
}
