package TicuJianu.Robert.g1100.Factory;

public class MarksmanChampion extends AbstractChampion {

    public static int DEFAULT_RANGE = 550;
    public static int DEFAULT_DAMAGE = 25;
    int range;
    int damage;

    public MarksmanChampion(String name, int cost, float hp, int range,int damage) {
        super(name, cost, hp);
        this.range = range;
        this.damage = damage;
    }

    public void snipe(AbstractChampion champ){
        System.out.println(this.name + " sniped "+champ.name + " from "+this.range + " meters for a total of"+this.damage+" damage!!");
        champ.hp -= this.damage;
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

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
