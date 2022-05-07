package TicuJianu.Robert.g1100.Decorator.Models;

import TicuJianu.Robert.g1100.Decorator.Interfaces.ChampionInterface;

public class TestDecorator {

    public void test(){
        ChampionInterface champ = new Champion("Lee Sin", 3150, 120);
        champ.attack();
        champ.defend(80);
        champ = new SwordDecorator(champ);
        champ.attack();
        champ.defend(20);
    }
}
