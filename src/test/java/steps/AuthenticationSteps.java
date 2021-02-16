package steps;



import core.TestBase;
import cucumber.api.PendingException;
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
	
	@Then("^I write \"([^\"]*)\" into First Name Input$")
	public void i_write_into_First_Name_Input(String firstName) throws Throwable {
	    page.setFirstName(firstName);
	}

	@Then("^I write \"([^\"]*)\" into Last Name Input$")
	public void i_write_into_Last_Name_Input(String lastName) throws Throwable {
		page.setLastName(lastName);
		Thread.sleep(4000);
	}
	
	@Then("^I check the Mr radio button$")
	public void i_check_the_Mr_radio_button() throws Throwable {
	    page.clickMrRadioButton();
	}
	
	@Then("^I write \"([^\"]*)\" into Password Input$")
	public void i_write_into_Password_Input(String arg1) throws Throwable {
	    page.setPassword(arg1);
	}

	@Then("^I write \"([^\"]*)\" into Address Input$")
	public void i_write_into_Address_Input(String arg1) throws Throwable {
	    page.setAddress(arg1);
	}

	@Then("^I write \"([^\"]*)\" into City Input$")
	public void i_write_into_City_Input(String arg1) throws Throwable {
	    page.setCity(arg1);
	}

	@Then("^I write \"([^\"]*)\" into Zip Code Input$")
	public void i_write_into_Zip_Code_Input(String arg1) throws Throwable {
		page.setZipCode(arg1);
	}

	@Then("^I select \"([^\"]*)\" at the State combo box$")
	public void i_select_at_the_State_combo_box(String arg1) throws Throwable {
		page.selectState(arg1);
	}

	@Then("^I select \"([^\"]*)\" at the Country combo box$")
	public void i_select_at_the_Country_combo_box(String arg1) throws Throwable {
		page.selectCountry(arg1);
	}

	@Then("^I write \"([^\"]*)\" into Mobile Phone input$")
	public void i_write_into_Mobile_Phone_input(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    page.setMobilePhone(arg1);
	    Thread.sleep(4000);
	}
	
	@When("^I click the Register Button$")
	public void i_click_the_Register_Button() throws Throwable {
		page.clickRegisterBtn();
	}

	@Then("^I should see the message \"([^\"]*)\" in screen$")
	public void i_should_see_the_message_in_screen(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		page.checkTextExists(arg1);
	}
	
	@When("^I select the option \"([^\"]*)\" at the Month combo box$")
	public void i_select_the_option_at_the_Month_combo_box(String arg1) throws Throwable {
	    page.selectMonthOfBirth(arg1);
	}

	@When("^I select the option \"([^\"]*)\" at the Year combo box$")
	public void i_select_the_option_at_the_Year_combo_box(String arg1) throws Throwable {
	    page.selectYearOfBirth(arg1);
	}




}
