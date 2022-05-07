package TicuJianu.Robert.g1100.Decorator.Models;

import TicuJianu.Robert.g1100.Decorator.Interfaces.ChampionInterface;

public abstract class ChampionDecorator implements ChampionInterface {

    protected ChampionInterface champion;

    public ChampionDecorator(ChampionInterface champ){
        this.champion = champ;
    }

    public ChampionInterface removeDecorator(){
        return this.champion;
    }

    @Override
    public void defend(int dmg) {
        System.out.println("Default defend");
    }
}
