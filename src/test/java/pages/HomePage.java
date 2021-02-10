package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import core.TestBase;

public class HomePage extends TestBase{
	By callUsNowText = By.className("shop-phone");
	By contactUs = By.cssSelector("a[title='Contact Us']");
	By signIn = By.cssSelector("a[title='Log in to your customer account']");
	By searchInput = By.id("search_query_top");
	
	
	public String getCallUsNowText() {
		return driver.findElement(callUsNowText).getText();
	}
	
	public String getContactUsText() {
		return driver.findElement(contactUs).getText();
	}
	
	public String getSignInText() {
		return driver.findElement(signIn).getText();
	}
	
	public void clickSignIn() {
		driver.findElement(signIn).click();
	}
}
