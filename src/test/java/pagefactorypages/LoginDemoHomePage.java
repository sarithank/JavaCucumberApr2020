package pagefactorypages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginDemoHomePage {
	
	
	@FindBy(linkText = "FREE SIGN UP")
	private WebElement Veryfy_homepagelinktext;
	
	@FindBy(tagName = "a")
	private List<WebElement> list_links;
	
	WebDriver driver;
	
	public LoginDemoHomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public void verifyHomepage() {
		Veryfy_homepagelinktext.isDisplayed();
	}

		
	}





