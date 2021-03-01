package excuta;




import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		// caminho das features
		features = "src/test/resources/features",

		// caminho dos steps de testes
		glue = "teste",

		// tag para indicar qual teste devera ser executado
		tags = "@executa",

		// pretty para deixar o console igual a execucao cucumber | html para gerar
		// evidencia
		plugin = { "pretty", "html:target/report.html" },

		//
		monochrome = true, dryRun = false

)


public class Runner {

}
