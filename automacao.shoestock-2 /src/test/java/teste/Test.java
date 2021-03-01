package teste;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import elementos.Elementos;

import metodos.Metodos;

public class Test {

	
	Metodos metodo = new Metodos();
	Elementos elemento = new Elementos();
	


	@Given("^que esteja \"([^\"]*)\"$")
	public void que_esteja(String site) throws Throwable {
		metodo.abrirSite(site);
	}

	@When("^realize uma busca de produto$")
	public void realize_uma_busca_de_produto() throws Throwable {
		metodo.digitar(elemento.getBuscar(), "bota");
		metodo.submit(elemento.getBuscar());
		metodo.clickar(elemento.getProduto());
		metodo.clickar(elemento.getTamanho());
		metodo.clickar(elemento.getComprar());
	}

	@Then("^valido os produtos na tela de pagamento$")
	public void valido_os_produtos_na_tela_de_pagamento() throws Throwable {
		metodo.validarProduto(elemento.getValidaProduto(), "Bota Couro Shoestock Cano Curto Travel Feminina");
		metodo.screenShot();
		metodo.fecharNavegador();
  
	}
	
	
}
