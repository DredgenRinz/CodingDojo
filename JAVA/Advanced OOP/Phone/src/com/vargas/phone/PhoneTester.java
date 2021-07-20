package com.vargas.phone;
public class PhoneTester {
    public static void main(String[] args) {
        Galaxy s9 = new Galaxy("S9", 99, "Verizon", "Ring Ring Ring!");
        IPhone iphoneX = new IPhone("X", 100, "AT&T", "Zing");

        s9.displayInfo();
        System.out.println("Galaxy " + s9.getVersionNumber() + " says " + s9.ring());
        System.out.println("Unlocking via " + s9.unlock());

        iphoneX.displayInfo();
        System.out.println("iPhone " + iphoneX.getVersionNumber() + " says " + iphoneX.ring());
        System.out.println("Unlocking via " + iphoneX.unlock());
    }
}
