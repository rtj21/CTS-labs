package TicuJianu.Robert.g1100.Composite;

import java.util.ArrayList;

public class Region extends HierarchyNode{

    ArrayList<HierarchyNode> elements = new ArrayList<>();
    String regionName;
    int noChampions;

    public Region(String regionName, int noChampions) {
        this.regionName = regionName;
        this.noChampions = noChampions;
    }

    @Override
    public String getName() {
        return this.regionName;
    }

    @Override
    public int getCost() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getInfo() {
        String retStr="Region name: "+this.regionName +"\n No. champs: " +this.noChampions+"\n Info: \n";
        int noChamps=0;
        for(HierarchyNode node: elements){
            retStr+=node.getInfo()+"\n";
        }
        return retStr;
    }

    @Override
    public void addChild(HierarchyNode node) {
        elements.add(node);
    }

    @Override
    public void deleteChild(HierarchyNode node) {
        elements.remove(node);
    }

    @Override
    public void getChild(int i) {
        elements.get(i);
    }
}
