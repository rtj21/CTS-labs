package TicuJianu.Robert.g1100.Decorator;

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
