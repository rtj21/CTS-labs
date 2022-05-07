package TicuJianu.Robert.g1100.Composite.Models;

public class Champion extends HierarchyNode{

    String name;
    int cost;

    public Champion(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getCost() {
        return this.cost;
    }
}
