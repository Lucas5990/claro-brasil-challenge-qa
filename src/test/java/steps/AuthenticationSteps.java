package steps;



import core.TestBase;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AuthenticationPage;

public class AuthenticationSteps extends TestBase{
	
	private AuthenticationPage page;
	
	public AuthenticationSteps() {
		this.page = new AuthenticationPage();
	}
	
	@When("^I write \"([^\"]*)\" in the Create Account Email input$")
	public void i_write_in_the_Create_Account_Email_input(String email) throws Throwable {
		page.writeCreateAccountEmail(email);
	}
	
	@Then("^I click at the Create an Account button$")
	public void i_click_at_the_Create_an_Account_button() throws Throwable {
	    page.clickCreateAccountBtn();
	}
	
	@Then("^I select the option \"([^\"]*)\" at the Days combo box$")
	public void i_select_the_option_at_the_Days_combo_box(String opt) throws Throwable {
	    page.selectDayOfBirth(opt);
	    Thread.sleep(4000);
	}



}
