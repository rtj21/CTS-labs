package ro.ase.csie.g1099.design.patterns.heroes;

import ro.ase.csie.g1099.design.patterns.heroes.disney.Disney2ACMEAdapter;
import ro.ase.csie.g1099.design.patterns.heroes.disney.DisneyHeroInterface;
import ro.ase.csie.g1099.design.patterns.heroes.disney.DisneySuperhero;

public class Main {
    public static void main(String[] args) {
        ACMEHeroInterface superman = new ACMESuperHero("Superman", 100);
        superman.run();

        ACMEHeroInterface batman = new ACMESuperHero("Batman", 200);
        batman.defend(20);

        DisneyHeroInterface vader = new DisneySuperhero("Vader", 1000, false);

        ACMEHeroInterface acmeVader = new Disney2ACMEAdapter(vader);
        acmeVader.run();
        acmeVader.defend(40);

        ACMEHeroInterface acmeLuke = new Disney2ACMEAdapter(new DisneySuperhero("Luke",500,true));
        acmeLuke.run();
    }
}
