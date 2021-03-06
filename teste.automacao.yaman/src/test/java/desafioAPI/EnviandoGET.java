package desafioAPI;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.hamcrest.core.StringContains;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class EnviandoGET {

	Response res = RestAssured.get("https://api.trello.com/1/actions/592f11060f95a3d3d46a987a");

	@org.junit.Test
	public void exibir() {

		String corpo = res.asString();

		System.out.println(corpo);

		JsonPath jsonPathEvaluator = res.jsonPath();

		String nome = jsonPathEvaluator.get("data.list.name");

		System.out.println(nome);

		assertThat(corpo, StringContains.containsString(nome));

	}

	@org.junit.Test
	public void validarStatus() {

		int statusCode = res.getStatusCode();

		System.out.println(statusCode);

		assertEquals(statusCode, 200);

	}

}
