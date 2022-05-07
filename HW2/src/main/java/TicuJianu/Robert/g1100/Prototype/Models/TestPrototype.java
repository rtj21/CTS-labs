package TicuJianu.Robert.g1100.Prototype.Models;

import java.util.ArrayList;

public class TestPrototype {
    public void test(){
        ArrayList<Integer> list = new ArrayList();
        list.add(10);
        list.add(30);
        list.add(50);
        list.add(15);
        PetCompanion pet = new PetCompanion("Poro", list);
        Champion ahri = new Champion("Ahri",6300,pet);

        try {
            Champion ahriCopy = (Champion) ahri.clone();

            if(ahri.equals(ahriCopy)==true)
                System.out.println("They are the same object");
            else System.out.println("They are NOT the same object");

            if (ahri.pet.equals(ahriCopy.pet)==true)
                System.out.println("Pet shallow copy!!!");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
}
