package ro.ase.csie.cts.g1099.design.patterns.state.initial;

public class Hero implements HeroInterface{

    int points;
    String name;

    public Hero(int points, String name) {
        this.points = points;
        this.name = name;
    }

    @Override
    public void move() {
        if(this.points >= 50)
            System.out.println(this.name+" is running");
        else if(this.points >=20){
            System.out.println(this.name + " is limping");
        }
        else{
            System.out.println(this.name + " is laying down. Critical wounded");
        }
    }

    @Override
    public void heal(int points) {

    }

    @Override
    public void defend(int points) {

    }

    @Override
    public int getPoints() {
        return 0;
    }

    @Override
    public void setPoints(int points) {
        this.points = points;
    }
}
