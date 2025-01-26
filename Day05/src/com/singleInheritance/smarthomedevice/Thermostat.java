package com.singleInheritance.smarthomedevice;

//Creating Subclass "Thermostat" inherits 'Device' class
public class Thermostat extends Device {
    int temperatureSetting;
    Thermostat(int deviceId, String status, int temperatureSetting){
        super(deviceId,status);
        this.temperatureSetting=temperatureSetting;
    }

    public void displayStatus(){
        super.displayStatus();
        System.out.println("Temperature set : "+temperatureSetting);
    }
}