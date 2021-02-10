package pages;

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
	
	@FindBy(id="days")
	WebElement dayCombo;
	
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
}
