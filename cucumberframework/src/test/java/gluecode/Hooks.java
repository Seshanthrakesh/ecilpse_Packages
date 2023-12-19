package gluecode;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.Utils;

public class Hooks {
Utils util =new Utils();
	
	@Before
	public void BeforeScenario(Scenario scenario) {
		String ScenarioName=scenario.getName();
		System.out.println("ScenarioName----->"+ScenarioName);
		util.launchBrowser("https://www.google.com");
	}
	
	@After
	public void AfterScenario() {
		Utils.driver.quit();
	}
}
