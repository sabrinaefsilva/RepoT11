package runner;

import org.junit.runner.RunWith;

import drive.Drivers;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "steps",
		tags = "@regressivo",
		dryRun = false,
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		plugin = {"pretty","html:target/cucumber-report.html"}
		)

public class Executa extends Drivers{
	public static void abrirNavegador() {
		try {
			WebDriverManager.chromedriver().setup();
			driver.get("https://www.saucedemo.com");
			driver.manage().window().maximize();
			}catch (Exception e) {
				System.out.println("Erro");
				
			}
	}
	public static void fecharNavegador() {
		driver.quit();
		
	}
	

}
