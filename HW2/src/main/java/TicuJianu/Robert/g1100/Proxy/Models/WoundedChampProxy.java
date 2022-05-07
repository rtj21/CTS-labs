package TicuJianu.Robert.g1100.Proxy.Models;

import TicuJianu.Robert.g1100.Proxy.Interfaces.ChampionInterface;

public class WoundedChampProxy implements ChampionInterface {

    private ChampionInterface champ;
    int criticalHP;
    boolean isDead;

    public WoundedChampProxy(ChampionInterface champ, int criticalHP) {
        this.champ = champ;
        this.criticalHP = criticalHP;
        isDead = false;
    }

    @Override
    public void attack() {

    }

    @Override
    public void defend() {

        if (!isDead) {

            if (((Champion) this.champ).hp <= criticalHP) {
                System.out.println("This champion is too wounded to defend... He died...");
                isDead = true;
            } else {
                this.champ.defend();
            }
        }
        else{
            System.out.println("Champion is dead.");
        }
    }

    @Override
    public void hurt(int dmg) {

        if (!isDead) {
            this.champ.hurt(dmg);
        }
        else{
            System.out.println("Champion is dead.");
        }
    }
}
