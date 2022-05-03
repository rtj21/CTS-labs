package TicuJianu.Robert.g1100.Factory;

public class TestFactory {

    public static void main(String[] args) {
        AbstractChampion marksman = ChampionFactory.getChampion(ChampionType.Marksman,"Draven", 6300,700);
        marksman.taunt();
        AbstractChampion support = ChampionFactory.getChampion(ChampionType.Support,"Soraka",3150, 550);
        support.recall();
        ((SupportChampion)support).heal(marksman);
        System.out.println(marksman.getHp());
    }

}
