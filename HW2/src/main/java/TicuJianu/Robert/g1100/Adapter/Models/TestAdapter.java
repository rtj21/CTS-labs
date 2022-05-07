package TicuJianu.Robert.g1100.Adapter.Models;

import TicuJianu.Robert.g1100.Adapter.Interfaces.DefensiveInterface;
import TicuJianu.Robert.g1100.Adapter.Interfaces.OffensiveInterface;

public class TestAdapter {

    public void test(){
        OffensiveInterface offChamp = new OffensiveChampion("Sett",300,OffensiveChampion.DEFAULT_OFFENSIVE);
        offChamp.attack();
        DefensiveInterface deffChamp = new DefensiveChampion("Braum", 1100, DefensiveChampion.DEFAULT_DEFENSIVE);
        deffChamp.defend();

        OffensiveInterface deff2off = new Defensive2OffensiveObject(deffChamp,OffensiveChampion.DEFAULT_OFFENSIVE);
        deff2off.attack();
    }
}
