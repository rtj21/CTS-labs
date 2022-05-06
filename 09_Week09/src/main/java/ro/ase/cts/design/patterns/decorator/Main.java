package ro.ase.cts.design.patterns.decorator;

public class Main {

    public static void main(String[] args) {
        AbstractHero darkKnight = new Knight("Dark Knight", 100);
        darkKnight.move(100);
        darkKnight.defend(10);

        AbstractHero whiteKnight = new Knight("White Knight", 99);

//        ShieldDecorator knightWithShield = new ShieldDecorator(darkKnight,50);
//        knightWithShield.defend(30);

        darkKnight = new ShieldDecorator(darkKnight,50);
        darkKnight.move(100);
        darkKnight.defend(10);

        darkKnight = new WoundedDecorator(darkKnight);
        darkKnight.move(100);
        System.out.println(darkKnight.points);
        darkKnight.defend(250);
        System.out.println(darkKnight.points);
        darkKnight.move(100);
    }
}
