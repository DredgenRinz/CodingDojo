package com.vargas.dad;
public class HumanaTest {
    public static void main(String[] args) throws Exception {
        Human sam = new Human();
        Human john = new Human();
        System.out.println("Bienvenido al Club de la pelea, hoy sam pelearaá con john!");
        sam.attackHuman(john);
        john.attackHuman(sam);
        sam.attackHuman(john);
        sam.attackHuman(john);
        sam.attackHuman(john);
        System.out.println("La pelea ha finalizado, Sam tiene " + sam.showHealth() + " de vida y john tiene " + john.showHealth() + ".");
    }
}
