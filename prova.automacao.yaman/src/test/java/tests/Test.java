package tests;

import java.io.IOException;

import elements.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import methods.MetodosAPI;
import methods.MetodosUI;

public class Test {

	MetodosAPI metodosApi = new MetodosAPI();
	MetodosUI metodoUi = new MetodosUI();
	Elementos elemento = new Elementos();

	@Given("que esteja {string}")
	public void que_esteja(String site) {
		metodoUi.abrirSite(site);
	}

	@When("realize uma busca de produto")
	public void realize_uma_busca_de_produto() throws InterruptedException {
		metodoUi.pausa(2000);
		metodoUi.digitar(elemento.getBuscar(), "bota");
		metodoUi.submit(elemento.getBuscar());
		metodoUi.clickar(elemento.getProduto());
		metodoUi.clickar(elemento.getTamanho());
		metodoUi.clickar(elemento.getCookies());
		metodoUi.clickar(elemento.getComprar());
	}

	@Then("valido os produtos na tela de pagamento")
	public void valido_os_produtos_na_tela_de_pagamento() throws IOException, InterruptedException {
		
		metodoUi.pausa(4000);
		metodoUi.validarProduto(elemento.getValidaProduto(), "Bota Coturno Shoestock Couro Fivelas Feminina");
		metodoUi.screenShot("produto");
		metodoUi.fecharNavegador();
	}

	@Given("que eu acesse a api get para consultar profissional")
	public void que_eu_acesse_a_api_get_para_consultar_profissional() {
		metodosApi.acessarApi("https://api.trello.com/1/actions/592f11060f95a3d3d46a987a");
	}

	@Then("valido o status code do retorno")
	public void valido_o_status_code_do_retorno() {
		metodosApi.statusCod(200);
	}

	@Then("valido o nome {string}")
	public void valido_o_nome(String string) {
		metodosApi.body(string);

	}

}
