package step_def;



import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.*;



public class GoogleSearchStep {
	
	public static WebDriver driver= null;
	public static WebDriverWait  wait= null; 

@Given("browser is open")
public void browser_is_open() {
    System.out.println("open the browser");
   System.setProperty("webdriver.chrome.driver","/Users/sarithaganaparthi/Downloads/chromedriver");
    //System.setProperty("webdriver.chrome.driver","/Users/sarithaganaparthi/Documents/Saritha/eclipseProject/JavaCucumberApr2022/src/test/resources/drivers/chromedriver");
   driver = new ChromeDriver();
  // wait = new WebDriverWait(driver, 30); -> this is old
   wait =new WebDriverWait(driver,Duration.ofSeconds(30));
  // driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);->selenium 3
   
   //selenium-4
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
   driver.manage().window().maximize();
}

@When("user enters url")
public void user_enters_url() {
	System.out.println("enter th url");
    driver.get("https://www.google.com/");
   
}

@When("user is on google search page")
public void user_is_on_google_search_page() {
    System.out.println("verify the google search page");
   WebElement googleImg= driver.findElement(By.xpath("//*[@alt='Google']"));
  
  
 
  wait.until(ExpectedConditions.visibilityOf(googleImg));
}

@When("user enters text in search box")
public void user_enters_text_in_search_box() {
    System.out.println("Enters Text in the search box");
    driver.findElement(By.name("q")).sendKeys("Saritha");
}

@And("hits enter")
public void hits_enter() {
   System.out.println("click on the serch icon");
   
   driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
}

@Then("user navigated to search results page")
public void user_navigated_to_search_results_page() {
  System.out.println(" verufy the search results page");
  wait.until(ExpectedConditions.titleContains("Google Search"));
  String searchresults = driver.findElement(By.id("result-stats")).getText();
  System.out.println("Search Result are :" + searchresults );
  
}

@Then("close the browser")
public void close_the_browser() {
   driver.close();
}

}
