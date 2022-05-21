package dev.zawarudo.pokeapi4java.exception;

/**
 * An exception that is thrown when an invalid Pokédex id has been used.
 */
public class InvalidPokedexIdException extends Exception {
	
	public InvalidPokedexIdException() {
	}

	public InvalidPokedexIdException(String errorMessage) {
		super(errorMessage);
	}
}