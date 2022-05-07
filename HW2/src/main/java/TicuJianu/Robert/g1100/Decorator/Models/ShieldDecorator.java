package TicuJianu.Robert.g1100.Decorator.Models;

import TicuJianu.Robert.g1100.Decorator.Interfaces.ChampionInterface;

public class ShieldDecorator extends ChampionDecorator{

    int defenses;

    public ShieldDecorator(ChampionInterface champ, int defenses) {
        super(champ);
        this.defenses = defenses;
    }

    @Override
    public void attack() {
        System.out.println("This champion can't attack");
    }

    @Override
    public void defend(int dmg) {
        System.out.println("This champion blocks "+ this.defenses + " damage");
        if(this.champion instanceof Champion)
            ((Champion)this.champion).hp-=dmg+this.defenses;
        else throw new UnsupportedOperationException();
    }
}
