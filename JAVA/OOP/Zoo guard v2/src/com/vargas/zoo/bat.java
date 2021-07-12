package com.vargas.zoo;
public class bat extends Mamal{
    
    public bat(){
        this.energyLevel = 300;
    }
    public void fly(){
        System.out.println("Oh no! El murciélago gigante se ha ido volando a otro lugar!!!");
        this.wasteEnergy(50);
    }

    public void eatHumans(){
        System.out.println("OH NO! EL MURCIÉLAGO GIGANTE SE COMIÓ A UN HUMANO!!! Bueno, no importa");
        this.gainEnergy(25);
    }

    public void attackTown(){
        System.out.println("EL MURCIÉLAGO GIGANTE ATACA LA CIUDAD! Se puede escuchar los gritos de la gente y las llamas por doquier...");
        this.wasteEnergy(100);
    }
}
