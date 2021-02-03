package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.WebDriver;

import core.DriverFactory;

public class HomePageSteps {
	@When("^I navigate to the URL \"([^\"]*)\"$")
	public void i_navigate_to_the_URL(String url) throws Throwable {
	    WebDriver driver = DriverFactory.getDriver();
	    driver.get(url);
	}

	@Then("^The Home Page is presented$")
	public void the_Home_Page_is_presented() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Abriu o navegador");
	    DriverFactory.killDriver();
	}
}
