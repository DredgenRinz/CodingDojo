package com.vargas.pokemon;
public abstract class AbstractPokemon implements PokemonInterface{
    public Pokemon createPokemon(String name, int health, String type){
        Pokemon poke = new Pokemon(name, health, type);
        return poke;
    }

    public String pokemonInfo(Pokemon pokemon){
        String data = "Nombre: " + pokemon.getName() + "\nVida: " + pokemon.getHealth() + "\nTipo: " + pokemon.getType();
        return data;
    }
}
