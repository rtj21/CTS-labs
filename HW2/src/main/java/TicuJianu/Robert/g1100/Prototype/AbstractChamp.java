package TicuJianu.Robert.g1100.Prototype;

import java.util.ArrayList;

public abstract class AbstractChamp implements Cloneable {

    String name;
    int cost;
    PetCompanion pet;


    public AbstractChamp() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public PetCompanion getPet() {
        return pet;
    }

    public void setPet(PetCompanion pet) {
        this.pet = pet;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object clone = null;

        clone = super.clone();

        return clone;

    }
}
