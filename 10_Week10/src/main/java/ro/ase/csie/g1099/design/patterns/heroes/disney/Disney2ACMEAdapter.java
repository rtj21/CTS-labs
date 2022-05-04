package ro.ase.csie.g1099.design.patterns.heroes.disney;

import ro.ase.csie.g1099.design.patterns.heroes.ACMEHeroInterface;

public class Disney2ACMEAdapter implements ACMEHeroInterface {

    DisneyHeroInterface disneyHero;

    private Disney2ACMEAdapter() {

    }

    public Disney2ACMEAdapter(DisneyHeroInterface disneyHero) {
        this.disneyHero = disneyHero;
    }

    @Override
    public void run() {
        this.disneyHero.move(10);
    }

    @Override
    public void heal(int points) {
        this.disneyHero.restorePoints(points);
    }

    @Override
    public void defend(int points) {
        DisneySuperhero superhero = (DisneySuperhero) this.disneyHero;
        superhero.lifepoints -= superhero.lifepoints;
        System.out.println("Damaging hero");
    }
}
