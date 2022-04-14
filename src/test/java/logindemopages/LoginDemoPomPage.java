package logindemopages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginDemoPomPage {
	//also we can make webdriver protected
	 WebDriver driver;
	
	//also we can make WebElements private 
	private By txt_userName = By.id("name");
	private By txt_passWord = By.id("password");
	private By btn_login   = By.id("login");
	private By txt_verify = By.linkText("FREE SIGN UP");
	
	
	
	public LoginDemoPomPage(WebDriver driver) { //same instance will run in logindemopomsteps class
		                                     //instad of creating defferent driver objects
		this.driver=driver;
		
		//we can check weather we are in login page in this constructor
		if(!driver.getTitle().equals("TestProject Demo")) {
			throw new IllegalStateException("this is not login page . the current page is "+driver.getCurrentUrl());
		}
	}
	
	public void enterUsername(String username) {
		driver.findElement(txt_userName).sendKeys(username);
		
	}
	
	public void enterPassword(String password) {
		driver.findElement(txt_passWord).sendKeys(password);
		
	}
	public void clickOnLoginButton() {
		driver.findElement(btn_login).click();
	}
	
	public void verifyTextIsDisplyed() {
		   driver.findElement(txt_verify).isDisplayed();
	 
	}

	/*//In real world you may want to create single function like below
	public void loginValidUser(String username, String password) {
		driver.findElement(txt_userName).sendKeys(username);
		driver.findElement(txt_passWord).sendKeys(password);
		driver.findElement(btn_login).click();
		driver.findElement(btn_login).click();*/
		
	}


