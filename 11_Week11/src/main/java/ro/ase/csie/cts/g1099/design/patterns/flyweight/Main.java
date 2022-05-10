package ro.ase.csie.cts.g1099.design.patterns.flyweight;


public class Main {

    public static void main(String[] args) {

        BuildingModelInterface building3DModel1 = BuildingFactory.getBuildingModel("Victorian house.model");

        BuildingModelInterface building3DModel2 = BuildingFactory.getBuildingModel("Victorian house.model");

        BuildingModelInterface building3DModel3 = BuildingFactory.getBuildingModel("Victorian house.model");

        building3DModel1.display(new DisplaySettings(10,20,"Gray"));
        building3DModel2.display(new DisplaySettings(160,920,"Green"));
        building3DModel3.display(new DisplaySettings(109,210,"Red"));
    }
}
