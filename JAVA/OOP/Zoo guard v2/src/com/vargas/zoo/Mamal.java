package com.vargas.zoo;
public class Mamal{
    protected int energyLevel = 100;

    public int displayEnergy(){
        return this.energyLevel;
    }

    public void wasteEnergy(int e){
        this.energyLevel -= e;
    }

    public void gainEnergy(int g){
        this.energyLevel += g;
    }


}