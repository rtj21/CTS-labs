package TicuJianu.Robert.g1100.Flyweight;

public class TestFlyweight {

    public void test(){

        PrestigeSkin skin1 = (PrestigeSkin) PrestigeSkinFactory.getSkin("Victorious");
        PrestigeSkin skin2 = (PrestigeSkin) PrestigeSkinFactory.getSkin("Ruined");
        PrestigeSkin skin3 = (PrestigeSkin) PrestigeSkinFactory.getSkin("Ruined");

        SkinContext context1 = new SkinContext("Pink Salmon", "gold");
        SkinContext context2 = new SkinContext("Blue", "red");
        SkinContext context3 = new SkinContext("Blue", "yellow");

        skin1.applySkin(context1);
        skin2.applySkin(context2);
        skin2.applySkin(context3);
    }
}
