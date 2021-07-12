package com.vargas.zoo;
public class BatTest {
    public static void main(String[] args) throws Exception {
        bat fifi = new bat();
        System.out.println("Bienvenido al Zoo, Aqui tenemos a un Murciélago gigante... OH NO SE HA ESCAPADO!!!");
        fifi.attackTown();
        fifi.attackTown();
        fifi.attackTown();
        fifi.eatHumans();
        fifi.eatHumans();
        fifi.fly();
        fifi.fly();
        System.out.println("Despues de todo este desastre, el muciélago tiene " + fifi.displayEnergy() + " de energia... \nCreo que ha muerto de cansancio...");
    }
}
