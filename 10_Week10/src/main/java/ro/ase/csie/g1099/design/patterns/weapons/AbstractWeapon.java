package ro.ase.csie.g1099.design.patterns.weapons;

public abstract class AbstractWeapon {
    String model;
    public abstract void reload();
    public abstract void shoot();

    public AbstractWeapon(String model) {
        this.model = model;
    }
}

