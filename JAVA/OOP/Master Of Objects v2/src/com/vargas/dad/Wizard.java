package com.vargas.dad;

public class Wizard extends Human{
    public Wizard(){
        this.health = 50;
        this.intelligence = 8;
    }

    public void heal (Human h){
        h.receiveHeal(this.intelligence);
    }

    public void fireball(Human h){
        h.receiveDMG(this.intelligence * 3);
    }
    
}
