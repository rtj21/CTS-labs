package ro.ase.cts.g1099.lab1.exceptions;

public class InsufficientFundsException extends Exception{
    public InsufficientFundsException() {
    }

    public InsufficientFundsException(String message) {
        super(message);
    }

}
