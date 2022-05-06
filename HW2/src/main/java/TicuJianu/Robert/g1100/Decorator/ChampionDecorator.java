package TicuJianu.Robert.g1100.Decorator;

public abstract class ChampionDecorator implements ChampionInterface{

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
