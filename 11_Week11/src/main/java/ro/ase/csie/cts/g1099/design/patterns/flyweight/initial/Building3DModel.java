package ro.ase.csie.cts.g1099.design.patterns.flyweight.initial;

public class Building3DModel {
    String filename;
    int[] points;
    DisplaySettings displaySettings;

    public Building3DModel(String filename, DisplaySettings displaySettings) {
        this.filename = filename;
        this.displaySettings = displaySettings;
        System.out.println("Loading points from file "+this.filename);
        this.points = new int[(int)1e6];
    }

    public void display(){
        System.out.println("Displaying the building");
        System.out.println(
                String.format("Coordinates %d,%d and color %s",
                        this.displaySettings.x,
                        this.displaySettings.y,
                        this.displaySettings.color));
    }
}
