package TicuJianu.Robert.g1100.Decorator.Models;

import TicuJianu.Robert.g1100.Decorator.Interfaces.ChampionInterface;

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
    public void defend(int dmg) {
        System.out.println("Champion is defending without a shield");
        hp-=dmg;
    }
}
