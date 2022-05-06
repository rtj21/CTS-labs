package ro.ase.cts.design.patterns.decorator;

public class ShieldDecorator extends HeroDecorator{


    int shieldStrength;


    public ShieldDecorator(AbstractHero hero,int shieldStrength) {
        super(hero);
        this.shieldStrength = shieldStrength;
    }

    @Override
    public void defend(int hitPoints) {
        System.out.println("The Knight is using a shield");
        hitPoints -= this.shieldStrength;
        if(hitPoints > 0)
            this.hero.defend(hitPoints);
    }


}
