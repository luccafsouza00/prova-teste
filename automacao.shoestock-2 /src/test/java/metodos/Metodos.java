package metodos;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {

	WebDriver driver;

	public void abrirSite(String site) {
		System.setProperty("webdriver.chrome.driver", "/Users/luccasouza/Documents/Driver/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.shoestock.com.br");
		driver.manage().window().maximize();
		

	}

	public void digitar(By elemento, String texto) throws InterruptedException {
		
		Thread.sleep(2000);
		WebElement buscar = driver.findElement(elemento);
		buscar.sendKeys(texto);

    }
		

	

	public void submit(By elemento) {
		driver.findElement(elemento).submit();

	}

	public void clickar(By elemento) {

		driver.findElement(elemento).click();

	}

	public void validarProduto(By elemento, String palavra) {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		String nomeProduto = driver.findElement(elemento).getText();
		assertEquals(nomeProduto, palavra);
	}
	
	
	public void screenShot( ) throws IOException {

		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./src/evidencias/" + "produto.png");
        FileUtils.copyFile(srcFile, destFile);

	}

	public void fecharNavegador() {
		driver.quit();
	}

}
