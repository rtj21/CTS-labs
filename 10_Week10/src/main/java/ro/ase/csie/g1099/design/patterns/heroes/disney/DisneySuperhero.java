package ro.ase.csie.g1099.design.patterns.heroes.disney;

public class DisneySuperhero implements DisneyHeroInterface{
    String heroName;
    int lifepoints;
    boolean isGoodHero;

    public DisneySuperhero(String heroName, int lifepoints, boolean isGoodHero) {
        this.heroName = heroName;
        this.lifepoints = lifepoints;
        this.isGoodHero = isGoodHero;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public int getLifepoints() {
        return lifepoints;
    }

    public void setLifepoints(int lifepoints) {
        this.lifepoints = lifepoints;
    }

    public boolean isGoodHero() {
        return isGoodHero;
    }

    public void setGoodHero(boolean goodHero) {
        isGoodHero = goodHero;
    }

    @Override
    public void move(int distance) {

    }

    @Override
    public void restorePoints(int points) {

    }

    @Override
    public void addPoints(int points) {

    }
}
