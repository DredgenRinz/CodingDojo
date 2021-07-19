package com.vargas.pokemon;

public class PokeTest {
    static Pokedex miDex = new Pokedex();
    public static void main(String[] args) {
        System.out.println("Iniciando Pokedex...");
        System.out.println("Agregando 1 Pokémon a la Pokedex...");
        miDex.newPoke("Bulbasour", 100, "Leaf");
        System.out.println("Agregando 1 Pokémon a la Pokedex...");
        miDex.newPoke("Charmander", 100, "Fire");
        System.out.println("Revisando pokedex");
        miDex.listPokemon();

        System.out.println("Preparando Batalla");
        System.out.println("Bulbasour ha atacado primero!!!");
        miDex.getPoke(0).attackPokemon(miDex.getPoke(1));
        System.out.println(miDex.pokemonInfo(miDex.getPoke(0)));
        System.out.println(miDex.pokemonInfo(miDex.getPoke(1)));

    }
}
