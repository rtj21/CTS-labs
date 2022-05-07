package TicuJianu.Robert.g1100.Composite.Models;

import TicuJianu.Robert.g1100.Composite.Models.Champion;
import TicuJianu.Robert.g1100.Composite.Models.Region;

public class TestComposite {

    public void test(){
        Region ionia = new Region("Ionia",30);
        Region runeterra = new Region("Runeterra", 130);

        ionia.addChild(new Champion("Ahri",6300));
        ionia.addChild(new Champion("Irelia",4800));

        runeterra.addChild(new Champion("Ryze",1300));
        runeterra.addChild(ionia);

        System.out.println(runeterra.getInfo());


    }
}
