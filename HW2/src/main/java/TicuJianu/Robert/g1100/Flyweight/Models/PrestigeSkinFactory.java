package TicuJianu.Robert.g1100.Flyweight.Models;

import TicuJianu.Robert.g1100.Flyweight.Interfaces.PrestigeSkinInterface;

import java.util.HashMap;
import java.util.Map;

public class PrestigeSkinFactory {
    private static Map<String, PrestigeSkinInterface> skins = new HashMap<String,PrestigeSkinInterface>();
    //eager
//    static {
//        getSkin("Victorious");
//        getSkin("Space Groove");
//        getSkin("Ruined");
//    }

    public static PrestigeSkinInterface getSkin(String skinName){
        PrestigeSkinInterface skin = skins.get(skinName);

        if(skin==null){
            switch (skinName){
                case "Victorious":
                    skin = new PrestigeSkin("Victorious",11);
                    break;
                case "Space Groove":
                    skin = new PrestigeSkin("Space Groove",3);
                    break;
                case "Ruined":
                    skin = new PrestigeSkin("Ruined",1);
                    break;
                default:
                    throw new UnsupportedOperationException();
            }

            skins.put(skinName, skin);
        }
        return skin;

    }


}
