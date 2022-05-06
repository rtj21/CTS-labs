package TicuJianu.Robert.g1100.Builder;

public class Champion {
    String name;
    int cost;

    boolean isAvailable;

    ARAMModeBuff aramModeBuff;
    PrestigeSkinInterface prestigeSkinInterface;
    UltimateSkinInterface ultimateSkinInterface;
    URFModeNerf urfModeNerf;

    private Champion(){

    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public ARAMModeBuff getAramModeBuff() {
        return aramModeBuff;
    }

    public PrestigeSkinInterface getPrestigeSkinInterface() {
        return prestigeSkinInterface;
    }

    public UltimateSkinInterface getUltimateSkinInterface() {
        return ultimateSkinInterface;
    }

    public URFModeNerf getUrfModeNerf() {
        return urfModeNerf;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setCost(int cost) {
        this.cost = cost;
    }

    private void setAvailable(boolean available) {
        isAvailable = available;
    }

    private void setAramModeBuff(ARAMModeBuff aramModeBuff) {
        this.aramModeBuff = aramModeBuff;
    }

    private void setPrestigeSkinInterface(PrestigeSkinInterface prestigeSkinInterface) {
        this.prestigeSkinInterface = prestigeSkinInterface;
    }

    private void setUltimateSkinInterface(UltimateSkinInterface ultimateSkinInterface) {
        this.ultimateSkinInterface = ultimateSkinInterface;
    }

    private void setUrfModeNerf(URFModeNerf urfModeNerf) {
        this.urfModeNerf = urfModeNerf;
    }


    public static class ChampionBuilder{
        private Champion champ = null;

        public ChampionBuilder(String name, int cost) {
            this.champ = new Champion();
            this.champ.name = name;
            this.champ.cost = cost;
        }

        public ChampionBuilder addPrestigeSkin(PrestigeSkinInterface prestigeSkinInterface){
            this.champ.setPrestigeSkinInterface(prestigeSkinInterface);
            return this;
        }

        public ChampionBuilder addUltimateSkin(UltimateSkinInterface ultimateSkinInterface){
            this.champ.setUltimateSkinInterface(ultimateSkinInterface);
            return this;
        }

        public ChampionBuilder addURFModeNerf(URFModeNerf urfModeNerf){
            this.champ.setUrfModeNerf(urfModeNerf);
            return this;
        }
        public ChampionBuilder addARAMModeBuff(ARAMModeBuff aramModeBuff){
            this.champ.setAramModeBuff(aramModeBuff);
            return this;
        }

        public Champion build(){
            return this.champ;
        }

    }
}
