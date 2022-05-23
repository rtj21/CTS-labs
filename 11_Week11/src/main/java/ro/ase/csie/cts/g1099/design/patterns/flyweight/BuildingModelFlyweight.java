package ro.ase.csie.cts.g1099.design.patterns.flyweight;

public class BuildingModelFlyweight implements BuildingModelInterface{

    String filename;
    int[] points;

    public BuildingModelFlyweight(String filename) {
        this.filename = filename;
        System.out.println("Loading the model from "+this.filename);
        this.points = new int[(int)1e6];
    }

    @Override
    public void display(DisplaySettings settings) {
        System.out.println("Displaying the building");
        System.out.println(
                String.format("Coordinates %d,%d and color %s",
                        settings.x,
                        settings.y,
                        settings.color));
    }
}
