package TicuJianu.Robert.g1100.Factory.Models;

public class ChampionFactory {

    public static AbstractChampion getChampion(ChampionType type, String name, int cost, float hp){
        switch(type){
            case Bruiser:
                return new BruiserChampion(name, cost, hp, BruiserChampion.DEFAULT_DAMAGE_REDUCTION);

            case Support:
                return new SupportChampion(name,cost,hp, SupportChampion.DEFAULT_HEAL_POWER);

            case Marksman:
                return new MarksmanChampion(name,cost,hp,MarksmanChampion.DEFAULT_RANGE,MarksmanChampion.DEFAULT_DAMAGE);

            default:
                throw new UnsupportedOperationException();
        }
    }
}
