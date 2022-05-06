package TicuJianu.Robert.g1100.Proxy;

public class TestProxy {

    public void test(){
        ChampionInterface champion = new Champion("Shen", 7800,80);

        champion.hurt(40);
        champion.defend();

        champion = new WoundedChampProxy(champion,60);

        champion.hurt(40);
        champion.defend();
        champion.defend();


    }
}
