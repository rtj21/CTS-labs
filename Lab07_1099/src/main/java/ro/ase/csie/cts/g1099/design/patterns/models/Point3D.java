package ro.ase.csie.cts.g1099.design.patterns.models;

public class Point3D implements Cloneable{
    public static final int LIMIT = 300;
    int x;
    int y;
    int z;

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() {
        return new Point3D(this.x, this.y, this.z);
    }
}
