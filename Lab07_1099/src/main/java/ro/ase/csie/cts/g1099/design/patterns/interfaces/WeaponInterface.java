package ro.ase.csie.cts.g1099.design.patterns.interfaces;

public interface WeaponInterface extends Cloneable{
    abstract void pewPew();
    abstract void reload();
    public abstract WeaponInterface clone();
}
