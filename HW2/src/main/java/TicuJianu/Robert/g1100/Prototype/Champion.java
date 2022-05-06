package TicuJianu.Robert.g1100.Prototype;

import java.util.ArrayList;

public class Champion extends AbstractChamp{


    public Champion(String name, int cost, PetCompanion pet) {

        this.name = name;
        this.cost = cost;
        this.pet = new PetCompanion(pet.name,pet.points);

        System.out.println("Wait 2 seconds");
        try {
            Thread.sleep(2000); // we simulate a module that has a heavy load and takes some time to process
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Champion() {

    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        ArrayList<Integer> points = new ArrayList<>();

        for (int i = 0; i < this.pet.points.size(); i++)
            points.add(this.pet.points.get(i));

        PetCompanion petCopy = new PetCompanion(this.pet.name,points);

        Champion champ = new Champion();
        champ.name = this.name;
        champ.pet = petCopy;
        champ.cost = this.cost;

        return champ;
    }

}
