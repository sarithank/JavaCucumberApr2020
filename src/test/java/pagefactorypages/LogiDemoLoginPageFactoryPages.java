package pagefactorypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LogiDemoLoginPageFactoryPages {
	

	@FindBy(xpath = "//*[@id='pageLogin']/h1")
	@CacheLookup
	private WebElement verify_loginpage;
	
	@FindBy(id = "name")
	@CacheLookup
	private WebElement txt_username;
	
	@FindBy(id="password")
	@CacheLookup
	private WebElement txt_password;
	
	@FindBy(id="login")
	@CacheLookup
	private WebElement btn_button;
	
	@FindBy(linkText = "FREE SIGN UP")
	@CacheLookup
	private WebElement Veryfy_homepagelinktext;
	
	@FindBy(how=How.ID,using="name")
	@CacheLookup
	private WebElement acb;
	
	WebDriver driver;
	
	public LogiDemoLoginPageFactoryPages(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		//this is for Ajax
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
		PageFactory.initElements(factory, this);
		
		//or you can directly say in single line instead of above 2 line code
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
		
	}
	
	
	public void verifyLoginPge() {
		verify_loginpage.isDisplayed();
		
	}
	
	public void enterUsername(String username) {
		txt_username.sendKeys(username);
	}

	public void enterPassword(String password) {
		txt_password.sendKeys(password);
	}
	
	public void clickOnLoginBtn() {
		btn_button.click();
	}
	
	public LoginDemoHomePage verifyHomepage() {
		
		return new LoginDemoHomePage(driver);
	}
}
