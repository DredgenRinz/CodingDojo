package com.vargas.zoo;
public class Gorilla extends Mamal{
    public void throwSomething(){
        System.out.println("Gorilla le ha arrojado algo a un visitante!!!");
        this.wasteEnergy(5);
    } 
    public void eatBananas() {
        System.out.println("Gorilla ha devorado una Banana, se ve muy satisfecho!!!");
        this.gainEnergy(10);
    }
    public void climb(){
        System.out.println("Gorilla ha subido a la cima del árbol!!!");
        this.wasteEnergy(10);
    }
}
