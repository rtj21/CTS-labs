package ro.ase.csie.cts.g1099.design.patterns.flyweight;

import java.util.HashMap;

public class BuildingFactory {

    static private HashMap<String,BuildingModelInterface> models = new HashMap<>();

    public static BuildingModelInterface getBuildingModel(String filename){
        BuildingModelInterface model = models.get(filename);

        if(model == null){
            model = new BuildingModelFlyweight(filename);

            models.put(filename, model);
        }

        return model;
    }
}
