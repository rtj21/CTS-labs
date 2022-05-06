package TicuJianu.Robert.g1100.Builder;

public class ChampionDirector {

    private Champion.ChampionBuilder builder;

    public ChampionDirector(Champion.ChampionBuilder builder){
        super();
        this.builder = builder;
    }

    public Champion getOPChamp(){
        return builder.addUltimateSkin(new UltimateSkinInterface() {
        public void spotlight(){
            System.out.println("I am in the spotlight!");
        }
        }).addARAMModeBuff(new ARAMModeBuff() {}).build();
    }
}
