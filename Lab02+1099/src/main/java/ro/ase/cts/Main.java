package ro.ase.cts;

import ro.ase.cts.exceptions.IllegalTransferException;
import ro.ase.cts.exceptions.InsufficientFundsException;
import ro.ase.cts.interfaces.IProfitable;
import ro.ase.cts.models.AccountType;
import ro.ase.cts.models.BankAccount;
import ro.ase.cts.models.Banker;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IllegalTransferException, InsufficientFundsException {
//        System.out.println("miau");
//        IProfitable reference;
//
//        try{
//            throw new InsufficientFundsException("You need a top-up");
//        }
//        catch(InsufficientFundsException ex){
//            System.out.println(ex.getMessage());
//        }
//        catch(Exception ex){
//            System.out.println("We have a problem!");
//        }
//        finally{
//            System.out.println("exceptions example");
//        }

        List<BankAccount> accounts= new ArrayList<>();
        Banker abc = new Banker("ABC");
        BankAccount myDebit = abc.openAccount(AccountType.SAVINGS);
        BankAccount myCredit = abc.openAccount(AccountType.CURRENT);

        accounts.add(myCredit);
        accounts.add(myDebit);

        myCredit.transfer(myDebit,1000);
    }
}
