package TicuJianu.Robert.g1100.Flyweight.Models;

import TicuJianu.Robert.g1100.Flyweight.Interfaces.PrestigeSkinInterface;

public class PrestigeSkin implements PrestigeSkinInterface {

    String skinName;
    int version;

    public PrestigeSkin(String skinName, int version) {
        this.skinName = skinName;
        this.version = version;
        System.out.println("Generated "+this.skinName);
    }

    @Override
    public void applySkin(SkinContext context) {
        System.out.println(this.skinName +" v"+this.version+" has as primary color " +context.getPrimaryColor()+" with accents of "+context.getSecondaryColor());
    }
}
