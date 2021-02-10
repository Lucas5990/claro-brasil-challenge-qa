package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import core.TestBase;

public class SignInPage extends TestBase{
	By createAccountEmailInput = By.id("email_create");
	By createAccountButton = By.id("SubmitCreate");
	
	
	public void writeCreateAccountEmail(String email) throws InterruptedException {
		this.driver.findElement(createAccountEmailInput).sendKeys(email);
		Thread.sleep(10000);
	}
	
}
