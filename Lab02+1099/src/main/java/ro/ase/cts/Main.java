package ro.ase.cts;

import ro.ase.cts.exceptions.InsufficientFundsException;
import ro.ase.cts.interfaces.IProfitable;

public class Main {
    public static void main(String[] args) {
        System.out.println("miau");
        IProfitable reference;

        try{
            throw new InsufficientFundsException("You need a top-up");
        }
        catch(InsufficientFundsException ex){
            System.out.println(ex.getMessage());
        }
        catch(Exception ex){
            System.out.println("We have a problem!");
        }
        finally{
            System.out.println("exceptions example");
        }
    }
}
