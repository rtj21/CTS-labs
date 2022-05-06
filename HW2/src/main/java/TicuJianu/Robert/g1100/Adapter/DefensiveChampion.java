package TicuJianu.Robert.g1100.Adapter;

import TicuJianu.Robert.g1100.Adapter.Interface.DefensiveInterface;

public class DefensiveChampion implements DefensiveInterface {

    public static final int DEFAULT_DEFENSIVE=15;

    String name;
    int hp;
    float defensive;

    public DefensiveChampion(String name, int hp, float defensive) {
        this.name = name;
        this.hp = hp;
        this.defensive = defensive;
    }

    @Override
    public void defend(){
        System.out.println("I am defending");
    }

    @Override
    public void guarding(int hit){
        System.out.println("I am guarding against a hit! The hit got reduced by "+ this.defensive + " points");
        hit-=this.defensive;

        if(hit>0)
            this.hp -= hit+defensive;
    }
}
