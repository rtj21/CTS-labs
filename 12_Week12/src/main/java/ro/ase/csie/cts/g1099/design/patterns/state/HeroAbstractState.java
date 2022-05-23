package ro.ase.csie.cts.g1099.design.patterns.state;

public abstract class HeroAbstractState {
    HeroInterface hero;

    public HeroAbstractState(HeroInterface hero) {
        this.hero = hero;
    }

    public abstract void moveAction();
    public abstract void healAction(int points);
    public abstract void defendAction(int points);
}
