package TicuJianu.Robert.g1100.Proxy;



public class Champion implements ChampionInterface {

    public String name;
    public int cost;
    public int hp;

    public Champion(String name, int cost, int hp) {
        this.name = name;
        this.cost = cost;
        this.hp = hp;
    }

    @Override
    public void attack() {
        System.out.println("Champion is attacking barehanded");
    }

    @Override
    public void defend() {

        System.out.println("Champion is defending without a shield");

    }

    @Override
    public void hurt(int dmg) {
        System.out.println("Championm was hurt from "+ this.hp + " to "+ (this.hp-dmg) + " hp.");
        this.hp-=dmg;
    }
}
