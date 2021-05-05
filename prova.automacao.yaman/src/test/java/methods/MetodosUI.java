package methods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.hamcrest.core.StringContains;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class MetodosUI {

	// Desafio WEB

	WebDriver driver;

	public void abrirSite(String site) {
		System.setProperty("webdriver.chrome.driver", "/Users/luccasouza/Documents/Driver/chromedriver");
		driver = new ChromeDriver();
		driver.get(site);
		driver.manage().window().maximize();

	}

	public void digitar(By elemento, String texto) throws InterruptedException {

		WebElement buscar = driver.findElement(elemento);
		buscar.sendKeys(texto);

	}

	public void submit(By elemento) {
		driver.findElement(elemento).submit();

	}

	public void clickar(By elemento) {

		driver.findElement(elemento).click();

	}

	public void validarProduto(By elemento, String palavra) throws InterruptedException {

		

		String nomeProduto = driver.findElement(elemento).getText();
		assertEquals(nomeProduto, palavra);
	}
	
	public void pausa(int tempo) throws InterruptedException {
		
		Thread.sleep(tempo);
	}

	public void screenShot(String nome) throws IOException {

		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./src/evidencias/" + nome + ".png");
		FileUtils.copyFile(srcFile, destFile);

	}

	public void fecharNavegador() {
		driver.quit();
	}
	


	


}
