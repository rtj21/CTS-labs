package ro.ase.csie.cts.course.design.patterns.builder.version1.lazy;
import ro.ase.csie.cts.course.design.patterns.builder.module.DisplaySuperAmoled;

public class TestBuilder {
    public static void main(String[] args) {
        //SmartDevice smartDevice = new SmartDevice();
        SmartDevice.SmartDeviceBuilder smartDeviceBuilder = new SmartDevice.SmartDeviceBuilder("S22","Samsung");
        SmartDevice smartDevice = smartDeviceBuilder.addWiFi()
                .addDisplay(new DisplaySuperAmoled(10)).build();
    }
}
