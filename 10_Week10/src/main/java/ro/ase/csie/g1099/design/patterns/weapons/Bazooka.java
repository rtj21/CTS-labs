package ro.ase.csie.g1099.design.patterns.weapons;

public class Bazooka extends AbstractWeapon{
    int distance;

    public Bazooka(String model, int distance) {
        super(model);
        this.distance = distance;
    }

    @Override
    public void shoot() {
        System.out.println("Kabooey!!");
    }

    @Override
    public void reload() {
        System.out.println("Reloading rocket");
    }
}
