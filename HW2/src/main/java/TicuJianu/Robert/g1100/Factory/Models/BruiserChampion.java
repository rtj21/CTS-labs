package TicuJianu.Robert.g1100.Factory.Models;

public class BruiserChampion extends AbstractChampion {

    public static float DEFAULT_DAMAGE_REDUCTION = 12;

    float damageReduction;

    public BruiserChampion(String name, int cost, float hp, float damageReduction) {
        super(name, cost, hp);
        this.damageReduction = damageReduction;
    }

    public void braceForDamage(){
        System.out.println(this.name + " is bracing and will reduce damage by "+this.damageReduction + "%");

    }

    @Override
    public void recall() {
        System.out.println(this.name + "is recalling...");
        this.hp = 100;
    }

    @Override
    public void useAbility() {
        System.out.println(this.name + " is using their ability!");
    }

    @Override
    public void taunt() {
        System.out.println(this.name + " is disrespecting their opponent!!!");
    }

    public float getDamageReduction() {
        return damageReduction;
    }

    public void setDamageReduction(float damageReduction) {
        this.damageReduction = damageReduction;
    }
}
