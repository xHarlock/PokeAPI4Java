package dev.zawarudo.pokeapi4java.exception;

/**
 * An exception thrown when no Pokémon could be found, e.g. by searching a name.
 */
public class PokemonNotFoundException extends Exception {
	
	public PokemonNotFoundException() {
	}
	
	public PokemonNotFoundException(String errorMessage) {
		super(errorMessage);
	}
}