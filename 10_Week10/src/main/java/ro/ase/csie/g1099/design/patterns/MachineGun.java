package ro.ase.csie.g1099.design.patterns;

public class MachineGun  extends  AbstractWeapon{
    public static final float DEFAULT_FIRE_RATE = 300;
    float fireRate;
    int distance;

    public MachineGun(String model, float fireRate, int distance) {
        super(model);
        this.fireRate = fireRate;
        this.distance = distance;
    }

    @Override
    public void reload() {
        System.out.println("Machine gun reloading!");
    }

    @Override
    public void shoot() {
        System.out.println("Ratatatattatata!!!");
    }

    public float getFireRate() {
        return fireRate;
    }

    public void setFireRate(float fireRate) {
        this.fireRate = fireRate;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
