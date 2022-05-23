package ticu.robert.g1099.Template;

public class Main {
    public static void main(String[] args) {
        TemplateWeatherStation collectData = new LakeWeatherStation();
        collectData.collectData();
        System.out.println();
        collectData =  new MountainWeatherStation();
        collectData.collectData();
    }
}
