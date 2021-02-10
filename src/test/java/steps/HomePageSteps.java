package steps;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.AuthenticationPage;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import core.DriverFactory;
import core.TestBase;

public class HomePageSteps extends TestBase{
	
	
	@When("^I navigate to the URL \"([^\"]*)\"$")
	public void i_navigate_to_the_URL(String url) throws Throwable {
		this.driver.get(url);
	}

	@Then("^The Home Page is presented$")
	public void the_Home_Page_is_presented() throws Throwable {
		System.out.println("Abriu o navegador");
		// Assert.assertEquals("Call us now: 0123-456-789", page.getCallUsNowText());
	}

	@Then("^I can see the navbar with the element \"([^\"]*)\"$")
	public void i_can_see_the_navbar_with_the_element(String element) throws Throwable {
		HomePage page = new HomePage();
		String actualText = "";
		System.out.println(element);
		switch (element) {
		case "Call us now: 0123-456-789":
			actualText = page.getCallUsNowText();
			break;
		case "Contact us":
			actualText = page.getContactUsText();
			break;
		case "Sign in":
			actualText = page.getSignInText();
			break;
		default:
			Assert.fail("This element does not exists in the Navbar: " + element);

		}
		Assert.assertEquals(element, actualText);
	}

	@When("^I left click at the Sign In button$")
	public void i_left_click_at_the_Sign_In_button() throws Throwable {
		HomePage page = new HomePage();
		page.clickSignIn();
	}
	
	


}
