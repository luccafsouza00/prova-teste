package desafioGET;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import org.hamcrest.core.StringContains;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test {

	Response res = RestAssured.get("https://api.trello.com/1/actions/592f11060f95a3d3d46a987a");

	@org.junit.Test
	public void exibir() {

		String corpo = res.asString();

		System.out.println(corpo);

		JsonParser parser = new JsonParser();
		InputStream InputStream = getClass().getClassLoader().getResourceAsStream("parse.json");
		Reader reader = new InputStreamReader(InputStream);
		JsonElement rootElement = parser.parse(reader);
		JsonObject rootObject = rootElement.getAsJsonObject();
		JsonObject pages = rootObject.getAsJsonObject("data").getAsJsonObject("list");
		JsonElement professional = pages.get("name");

		System.out.println(professional);

	}

	@org.junit.Test
	public void validarStatus() {

		int statusCode = res.getStatusCode();
		System.out.println(statusCode);
		assertEquals(statusCode, 200);

	}

}
