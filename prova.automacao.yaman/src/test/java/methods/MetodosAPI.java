package methods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.hamcrest.core.StringContains;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class MetodosAPI {
	

	Response response;

	public Response acessarApi(String uri) {

		response = RestAssured.get(uri);

		return response;
	}

	public void statusCod(int status) {

		int statusCod = response.getStatusCode();

		assertEquals(status, statusCod);

	}

	public void body(String texto) {

		String bodyResponse = response.asString();

		assertThat(bodyResponse, StringContains.containsString(texto));

		JsonPath jsonpath = response.jsonPath();

		String name = jsonpath.get("data.list.name");

		System.out.println();

		System.out.println("************************");

		System.out.println("------" + name + "------");

		System.out.println("************************");

		System.out.println();

	}

}
