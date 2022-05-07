package TicuJianu.Robert.g1100.Composite.Models;

import TicuJianu.Robert.g1100.Composite.Interfaces.NodeInterface;

public abstract class HierarchyNode implements NodeInterface {

    public String getInfo(){
        return this.getName() + " "+ this.getCost();
    }

    public void addChild(HierarchyNode node){
        throw new UnsupportedOperationException();
    }
    public void deleteChild(HierarchyNode node){
        throw new UnsupportedOperationException();
    }

    public void getChild(int i){
        throw new UnsupportedOperationException();
    }


    public abstract String getName();


    public abstract int getCost();
}
