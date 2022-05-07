package TicuJianu.Robert.g1100.Builder.Models;

import TicuJianu.Robert.g1100.Builder.Interfaces.URFModeNerf;

public class TestBuilder {
    public void test(){
        Champion Ahri = new Champion.ChampionBuilder("Ahri",6300).addURFModeNerf(new URFModeNerf() {
            void nerf(){
                System.out.println("I am nerfed!!");
            }
        }).build();

        Champion zed = new ChampionDirector(new Champion.ChampionBuilder("Zed",4800)).getOPChamp();

        System.out.println(Ahri.name+ " has a cost of "+Ahri.cost);
        System.out.println(zed.name);
        zed.ultimateSkinInterface.spotlight();
    }
}
