package ro.ase.cts.exceptions;

public class InsufficientFundsException extends Exception{
    public InsufficientFundsException() {
    }

    public InsufficientFundsException(String message) {
        super(message);
    }

}
