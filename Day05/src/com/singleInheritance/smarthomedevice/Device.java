package com.singleInheritance.smarthomedevice;
//Parent class
public class Device{
    int deviceId;
    String status;
    Device(int deviceId, String status){
        this.deviceId=deviceId;
        this.status=status;
    }
    public void displayStatus(){
        System.out.println("----Device Details----");
        System.out.println("Device Id : "+deviceId);
        System.out.println("Status : "+status);
    }
}
