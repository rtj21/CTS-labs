package ro.ase.csie.cts.g1099.design.patterns.state;

public class CriticalState extends HeroAbstractState{

    public CriticalState(HeroInterface hero) {
        super(hero);
    }

    @Override
    public void moveAction() {
        System.out.println("Is running");
    }

    @Override
    public void healAction(int points) {
        System.out.println("Is defending");
        this.hero.setPoints(this.hero.getPoints()-points);
    }

    @Override
    public void defendAction(int points) {
        System.out.println("Is healing");
        this.hero.setPoints(this.hero.getPoints()+points);

    }
}
