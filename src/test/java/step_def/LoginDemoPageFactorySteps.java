package step_def;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.*;
import pagefactorypages.LogiDemoLoginPageFactoryPages;
import pagefactorypages.LoginDemoHomePage;


public class LoginDemoPageFactorySteps {
	WebDriver driver;
	WebDriverWait wait;
	LogiDemoLoginPageFactoryPages loginpage;
	LoginDemoHomePage home_page;
	

@Given("User open the browser")
public void user_open_the_browser() {
	System.setProperty("webdriver.chrome.driver","/Users/sarithaganaparthi/Downloads/chromedriver");
	
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	driver.manage().window().maximize();
	wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	driver.get("https://example.testproject.io/web/");

	
   
}

@Given("verify user is on login page")
public void verify_user_is_on_login_page() {
	
	System.out.println("===i am inside the login feature===");
	System.out.println("user is on login page");
	
	//loginpage.verifyLoginPge();
   
}

@When("^user should enters (.*) and (.*)$")
public void user_should_enters_mariya_and(String username, String password) throws InterruptedException {
	loginpage = new LogiDemoLoginPageFactoryPages(driver);
	home_page =new LoginDemoHomePage(driver);
	loginpage.enterUsername(username);
	loginpage.enterPassword(password);
	Thread.sleep(2000);
}

@When("click on login button")
public void click_on_login_button() {
	loginpage.clickOnLoginBtn();
}

@Then("verify the home page")
public void verify_the_home_page() throws InterruptedException {
	home_page.verifyHomepage();
	Thread.sleep(2000);
	
	
}


@Then("close the broser")
public void close_the_broser() {
    driver.close();
    driver.quit();
}


}



