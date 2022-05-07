package TicuJianu.Robert.g1100.Factory.Models;

public abstract class AbstractChampion {
    String name;
    int cost;
    float hp;

    public abstract void recall();
    public abstract void useAbility();
    public abstract void taunt();

    public AbstractChampion(String name, int cost, float hp) {
        this.name = name;
        this.cost = cost;
        this.hp = hp;
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

    public float getHp() {
        return hp;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }
}
