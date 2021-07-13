package com.vargas.dad;

public class Samurai extends Human{
    private int samurai;
    public Samurai(){
        this.health = 200;
        this.samurais++;
        this.samurai = this.samurais;
    }

    public void deathBlow(Human h){
        h.health = 0;
        this.health /= 2;
    }

    public void meditate(){
        this.receiveHeal(this.health / 2);
    }
    public int howMany(){
        return this.samurai;
    }
}
