package dev.zawarudo.pokeapi4java.utils;

import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Collectors;

/**
 * A utility class for formatting text.
 */
public final class Formatter {

	private Formatter() {
	}

	public static String capitalize(String string) {
		return string.substring(0, 1).toUpperCase(Locale.UK) + string.substring(1);
	}

	/**
	 * Formats a given String the following way: lightning-rod -> Lightning Rod
	 */
	public static String format(String name) {
		return Arrays.stream(name.split("-"))
				.map(Formatter::capitalize)
				.collect(Collectors.joining(" "))
				.replace("Mr", "Mr.")
				.replace("Jr", "Jr.");
	}
}