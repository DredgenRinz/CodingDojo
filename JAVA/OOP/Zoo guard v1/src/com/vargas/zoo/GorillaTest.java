package com.vargas.zoo;
public class GorillaTest {
    public static void main(String[] args) throws Exception {
        Gorilla baba = new Gorilla();
        System.out.println("Bienvenido al Zoo, Aqui tenemos a un Gorilla");
        baba.throwSomething();
        baba.throwSomething();
        baba.throwSomething();
        baba.eatBananas();
        baba.eatBananas();
        baba.climb();
        System.out.println("Despues de todo ese show, Gorilla tiene " + baba.displayEnergy() + " de energia!!!");
    }
}
