package steps;



import core.TestBase;
import cucumber.api.java.en.When;
import pages.SignInPage;

public class SignInSteps extends TestBase{
	
	private SignInPage page;
	
	@When("^I write \"([^\"]*)\" in the Create Account Email input$")
	public void i_write_in_the_Create_Account_Email_input(String email) throws Throwable {
		this.page = new SignInPage();
		page.writeCreateAccountEmail(email);
	}
	
}
