package com.vargas.dad;
public class Human{
    protected int health = 100;
    protected int strength = 3;
    protected int stealth = 3;
    protected int intelligence = 3;
    protected int samurais = 0;

    public void attackHuman(Human h){
        h.receiveDMG(this.strength);
    }
    public void receiveDMG(int dmg){
        this.health -= dmg;
    }

    public int showHealth(){
        return this.health;
    }
    public void receiveHeal(int h){
        this.health += h;
    }

}