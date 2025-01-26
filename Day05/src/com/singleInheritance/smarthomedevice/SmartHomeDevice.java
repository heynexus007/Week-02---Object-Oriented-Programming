package com.singleInheritance.smarthomedevice;

public class SmartHomeDevice {
    public static void main(String[] args) {
        //Creating object1 to 'class Device or Thermostat' and giving values
        Device d1= new Thermostat(33674,"ON",86);
        d1.displayStatus(); //Calling display method of Sub-class
        System.out.println();
        //Creating object2 to 'class Device or Thermostat' and giving values
        Device d2= new Thermostat(33884,"ON",70);
        d2.displayStatus(); //Calling display method of Sub-class
    }
}
