package com.vargas.phone;

public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return super.getRingTone();
    }
    @Override
    public String unlock() {
        return "Finger Print";
    }
    @Override
    public void displayInfo() {
        System.out.println("Galaxy " + super.getVersionNumber() + " from " + super.getCarrier());
    }
}
