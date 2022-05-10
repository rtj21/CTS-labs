package ro.ase.csie.cts.g1099.design.patterns.flyweight.initial;

public class Main {

    public static void main(String[] args) {
        Building3DModel building3DModel1 =
                new Building3DModel("Victorian house.model",
                new DisplaySettings(10,10,"Grey"));

        Building3DModel building3DModel2 =
                new Building3DModel("Victorian house.model",
                        new DisplaySettings(270,110,"Light Grey"));

        Building3DModel building3DModel3 =
                new Building3DModel("Victorian house.model",
                        new DisplaySettings(109,160,"Grey"));
    }
}
