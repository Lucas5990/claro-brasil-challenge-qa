package steps;

import core.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks{
	@Before
	public void beforeScenario() {
		System.out.println("---- CEN�RIO INICIADO ----");
	}
	@After
	public void afterScenario() {
		DriverFactory.killDriver();
	}
}
