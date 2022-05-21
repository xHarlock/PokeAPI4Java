package dev.zawarudo.pokeapi4java.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.stream.Collectors;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public final class HttpResponse {

	private HttpResponse() {
	}

	/**
	 * Fetches a {@link JsonObject} from a given url.
	 */
	public static JsonObject getJsonObject(String url) throws IOException {
		HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
		connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.169 Safari/537.36");
		connection.setRequestMethod("GET");
		BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		String raw = reader.lines().collect(Collectors.joining("\n"));
		reader.close();
		return JsonParser.parseString(raw).getAsJsonObject();
	}

	public static String readLine(String url) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(new URL(url).openConnection().getInputStream()));
		String line = reader.readLine();
		reader.close();
		return line;
	}
}