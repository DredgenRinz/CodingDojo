package com.vargas.pokemon;

public class Pokemon {
    private String name;
    private double health;
    private String type;
    static int count = 0;
    
    public Pokemon(String na, double heal, String type){
        this.name = na;
        this.health = heal;
        this.type = type;
        count++;
    }

    public void attackPokemon(Pokemon poke){
        poke.receibeDMG(10);
    }

    public void receibeDMG(int i) {
        this.health -= i;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setHealth(double heal){
        this.health = heal;
    }
    public double getHealth(){
        return this.health;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return this.type;
    }
}
