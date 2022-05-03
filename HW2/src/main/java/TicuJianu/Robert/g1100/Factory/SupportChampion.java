package TicuJianu.Robert.g1100.Factory;

public class SupportChampion extends AbstractChampion {

    public static float DEFAULT_HEAL_POWER = 30;
    float healPower;

    public SupportChampion(String name, int cost, float hp, float healPower) {
        super(name, cost, hp);
        this.healPower = healPower;
    }

    public void heal(AbstractChampion champ){
        System.out.println(this.name + " is healing "+champ.name + " for "+this.healPower + " hp!");
        champ.hp +=this.healPower;
    }

    @Override
    public void recall() {
        System.out.println(this.name + " is recalling...");
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

    public float getHealPower() {
        return healPower;
    }

    public void setHealPower(float healPower) {
        this.healPower = healPower;
    }
}
