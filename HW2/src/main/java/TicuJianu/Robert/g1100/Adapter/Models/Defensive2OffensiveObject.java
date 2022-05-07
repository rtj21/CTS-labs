package TicuJianu.Robert.g1100.Adapter.Models;

import TicuJianu.Robert.g1100.Adapter.Interfaces.DefensiveInterface;
import TicuJianu.Robert.g1100.Adapter.Interfaces.OffensiveInterface;

public class Defensive2OffensiveObject implements OffensiveInterface {

    DefensiveInterface defensiveChampion;
    int offensive;

    public Defensive2OffensiveObject(DefensiveInterface defensiveChampion, int offensive) {
        this.defensiveChampion = defensiveChampion;
        this.offensive=offensive;
    }

    @Override
    public void attack() {
        System.out.println("The defensive champion is striking with his shield!!");
    }

    @Override
    public void train(int hit) {
        System.out.println("The defensive champion is training his offensive! It evolved by "+hit+" points");
        this.offensive+=hit;
    }
}
