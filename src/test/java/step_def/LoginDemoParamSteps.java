//package step_def;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import io.cucumber.java.en.*;
//
//
//
//public class LoginDemoParamSteps {
//	
//	public static WebDriver driver=null;
//	
//	public static WebDriverWait wait = null;
//	
//	@Given("User open the browser")
//	public void user_open_the_browser() {
//		  System.setProperty("webdriver.chrome.driver","/Users/sarithaganaparthi/Downloads/chromedriver");
//	   driver = new ChromeDriver();
//	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//	   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
//	   driver.manage().window().maximize();
//	   wait = new WebDriverWait(driver, Duration.ofSeconds(60));
//	   driver.get("https://example.testproject.io/web/");
//	}
//
//	@Given("verify user is on login page")
//	public void verify_user_is_on_login_page() {
//		
//		WebElement text = driver.findElement(By.xpath("//*[@id='pageLogin']/h1"));
//		//*[@id="pageLogin"]/h1
//	    wait.until(ExpectedConditions.textToBePresentInElement(text, "TestProject Example page"));
//	    
//	}
//	@When("^user should enters (.*) and (.*)$")
//	//@When("user should enters {string} and {int}")
//	public void user_should_enters_username_and_password(String username, String password) throws InterruptedException  {
//		driver.findElement(By.id("name")).clear();
//		driver.findElement(By.id("name")).sendKeys(username);
//		driver.findElement(By.id("password")).clear();
//		driver.findElement(By.id("password")).sendKeys(password);
//		Thread.sleep(2000);
//	}
//
//	@When("click on login button")
//	public void click_on_login_button() {
//	    driver.findElement(By.id("login")).click();
//	}
//
//	@Then("verify the home page")
//	public void verify_the_home_page() throws InterruptedException {
//	   WebElement linktext = driver.findElement(By.linkText("FREE SIGN UP"));
//	   wait.until(ExpectedConditions.elementToBeClickable(linktext));
//	   Thread.sleep(2000);
//	}
//
//	@Then("close the broser")
//	public void close_the_broser() {
//	    driver.close();
//	    driver.quit();
//	}
//
//
//}
