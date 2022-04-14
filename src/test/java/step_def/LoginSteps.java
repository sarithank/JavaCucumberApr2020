package step_def;

import io.cucumber.java.en.*;


public class LoginSteps {



// we can use regular experession in Annotion statement
//eg:@Given("^user is on login page$")
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("Inside Step - User is on login page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("Inside Step - User enters username and password");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("Inside Step - user clicks on login button");
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println( "Inside Step - user navigated to the home page");
	}

}
