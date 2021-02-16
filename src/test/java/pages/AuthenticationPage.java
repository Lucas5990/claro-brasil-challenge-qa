package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.TestBase;

public class AuthenticationPage extends TestBase{
	@FindBy(id="email_create")
	WebElement createAccountEmailInput;
	
	@FindBy(id="SubmitCreate")
	WebElement createAccountBtn;
	
	@FindBy(id="id_gender1")
	WebElement mrRadioBtn;
	
	@FindBy(id="customer_firstname")
	WebElement firstNameInput;
	
	@FindBy(id="customer_lastname")
	WebElement lastNameInput;
	
	@FindBy(id="email")
	WebElement emailInput;
	
	@FindBy(id="passwd")
	WebElement passwordInput;
	
	@FindBy(id="address1")
	WebElement addressInput;
	
	@FindBy(id="city")
	WebElement cityInput;
	
	@FindBy(id="postcode")
	WebElement zipCodeInput;
	
	@FindBy(id="phone_mobile")
	WebElement mobilePhoneInput;
	
	@FindBy(id="submitAccount")
	WebElement registerBtn;
	
	/* --------------- COMBO BOX --------------- */
	
	@FindBy(id="id_state")
	WebElement stateCombo;
	
	@FindBy(id="days")
	WebElement dayCombo;
	
	@FindBy(id="id_country")
	WebElement countryCombo;
	
	@FindBy(id="months")
	WebElement monthCombo;
	
	@FindBy(id="years")
	WebElement yearCombo;
	
	public AuthenticationPage() {
		PageFactory.initElements(this.driver, this);
	}
	
	
	public void writeCreateAccountEmail(String email) throws InterruptedException {
		createAccountEmailInput.sendKeys(email);
		
	}
	
	public void clickCreateAccountBtn() throws InterruptedException {
		createAccountBtn.click();
		Thread.sleep(4000);
	}
	
	public void clickMrRadioButton() {
		mrRadioBtn.click();
	}
	
	public void selectDayOfBirth(String opt) {
		Select dayOfBirth = new Select(dayCombo);
		dayOfBirth.selectByValue(opt);
	}
	
	public void selectMonthOfBirth(String opt) {
		Select monthOfBirth = new Select(monthCombo);
		monthOfBirth.selectByValue(opt);
	}
	
	public void selectYearOfBirth(String opt) {
		Select yearOfBirth = new Select(yearCombo);
		yearOfBirth.selectByValue(opt);
	}
	
	public void selectState(String opt) {
		Select state = new Select(stateCombo);
		state.selectByVisibleText(opt);
	}
	
	public void selectCountry(String opt) {
		Select country = new Select(countryCombo);
		country.selectByVisibleText(opt);
	}
	
	public void setFirstName(String firstName) {
		firstNameInput.sendKeys(firstName);
	}
	
	public void setLastName(String lastName) {
		lastNameInput.sendKeys(lastName);
	}
	
	public void setAddress(String address) {
		addressInput.sendKeys(address);
	}
	
	public void setPassword(String password) {
		passwordInput.sendKeys(password);
	}
	
	public void setCity(String city) {
		cityInput.sendKeys(city);
	}
	
	public void setZipCode(String zipCode) {
		zipCodeInput.sendKeys(zipCode);
	}
	
	public void setMobilePhone(String phone) {
		mobilePhoneInput.sendKeys(phone);
	}
	
	public void clickRegisterBtn() {
		registerBtn.click();
	}
	
	public void checkTextExists(String txt) {
		Boolean txtExists = driver.getPageSource().contains(txt);
		if(!txtExists) {
			Assert.fail();
		}
	}
}
