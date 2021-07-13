package com.vargas.dad;

public class Ninja extends Human{
    public Ninja(){
        this.stealth = 10;
    }

    public void steal(Human h){
        h.receiveDMG(this.stealth);
        this.receiveHeal(this.stealth);
    }

    public void runAway(){
        this.health -= 10;
    }
    
}
