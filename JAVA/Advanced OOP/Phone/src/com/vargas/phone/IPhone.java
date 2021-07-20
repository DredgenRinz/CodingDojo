package com.vargas.phone;

public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return super.getRingTone();
    }
    @Override
    public String unlock() {
        return "Face-Unlock";
    }
    @Override
    public void displayInfo() {
        System.out.println("iPhone " + super.getVersionNumber() + " from " + super.getCarrier());
    }
}