package ro.ase.csie.cts.course.design.patterns.builder.version1.eager;

import ro.ase.csie.cts.course.design.patterns.builder.module.SDCard;

public class SmartDeviceDirector {
    SmartDevice.SmartDeviceBuilder builder;

    public SmartDeviceDirector(SmartDevice.SmartDeviceBuilder builder){
        super();
        this.builder = builder;
    }

    public  SmartDevice buildSamsungS22(){
        return builder.addWiFi().addMemoryCard(new SDCard(32)).build();
    }

    public  SmartDevice buildApplePhone(){
        return builder.addWiFi().addMemoryCard(new SDCard(16)).build();
    }
}
