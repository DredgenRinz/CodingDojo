package com.vargas.pokemon;

import java.util.ArrayList;

public class Pokedex extends AbstractPokemon{
    private ArrayList <Pokemon> myPokemons = new ArrayList<>();
    
    public void listPokemon(){
        String names = "Los pokemones que tienes son: \n";
        for(Pokemon poke : myPokemons){
            names += poke.getName() + "\n";
        }
        System.out.println(names);
    }

    public void newPoke(String name, int health, String type){
        myPokemons.add( createPokemon(name, health, type) );
    }

    public Pokemon getPoke(int index){
        return myPokemons.get(index);
    }
}
