package TicuJianu.Robert.g1100;

import TicuJianu.Robert.g1100.Singleton.SnykAppType;
import TicuJianu.Robert.g1100.Singleton.SnykConnection;

public class Main {
    public static void main(String[] args) {
        SnykConnection snykConnection = SnykConnection.getConnection();
        snykConnection.appType = SnykAppType.Cpp;
        snykConnection.testApp();
        SnykConnection snykConnection1 = SnykConnection.getConnection();
        snykConnection1.appType = SnykAppType.DockerImage;
        snykConnection1.testApp();
    }
}
