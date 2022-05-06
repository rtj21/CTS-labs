package TicuJianu.Robert.g1100.Decorator;

public class SwordDecorator extends ChampionDecorator{
    public SwordDecorator(ChampionInterface champ) {
        super(champ);
    }

    @Override
    public void attack() {
        if(((Champion)this.champion).hp > 50)
        System.out.println("Champion is attacking with a sword!");
        else System.out.println("Champion swings his sword and misses!!!");
    }
}
