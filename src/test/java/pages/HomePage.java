package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	By callUsNowText = By.className("shop-phone");
	By contactUs = By.cssSelector("a[title='Contact Us']");
	By signIn = By.cssSelector("a[title='Log in to your customer account']");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getCallUsNowText() {
		return driver.findElement(callUsNowText).getText();
	}
	
	public String getContactUsText() {
		return driver.findElement(contactUs).getText();
	}
	
	public String getSignInText() {
		return driver.findElement(signIn).getText();
	}
}
