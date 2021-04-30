package elements;

import org.openqa.selenium.By;

public class Elementos {

	public By getBuscar() {
		return buscar;
	}

	public By getProduto() {
		return produto;
	}

	public By getTamanho() {
		return tamanho;
	}

	public By getComprar() {
		return comprar;
	}

	public By getValidaProduto() {
		return validaProduto;
	}

	public By getCookies() {
		return cookies;
	}

	private By buscar = By.id("search-input");

	private By produto = By.cssSelector("#item-list > div.wrapper > div:nth-child(1)");

	private By tamanho = By.cssSelector("a[class=\"product-item\"]");

	private By cookies = By.cssSelector("body > section > div > div.cookie-notification-button");

	private By comprar = By.id("buy-button-now");

	private By validaProduto = By.cssSelector("h3[qa-auto=product-name]");

}
