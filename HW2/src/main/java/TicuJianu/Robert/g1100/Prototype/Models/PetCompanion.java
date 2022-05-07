package TicuJianu.Robert.g1100.Prototype.Models;

import java.util.ArrayList;

public class PetCompanion {

    String name;
    ArrayList<Integer> points = new ArrayList<>();

    public PetCompanion(String name, ArrayList<Integer> points) {

        this.name = name;
        for (int i = 0; i < points.size(); i++)
            this.points.add(points.get(i));

    }

    public PetCompanion() {

    }
}
