package TicuJianu.Robert.g1100.Adapter;

import TicuJianu.Robert.g1100.Adapter.Interface.OffensiveInterface;

public class OffensiveChampion implements OffensiveInterface {

    public static final int DEFAULT_OFFENSIVE = 5;

    String name;
    int hp;
    float offensive;

    public OffensiveChampion(String name, int hp, float offensive) {
        this.name = name;
        this.hp = hp;
        this.offensive = offensive;
    }

    @Override
    public void attack(){
        System.out.println("I am attacking");
    }

    @Override
    public void train(int hit){
        System.out.println("I am training! My hit power just got increased by "+ this.offensive + " points");

        this.offensive += hit;
    }
}
