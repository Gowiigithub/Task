package org.steps;

	import org.junit.Assert;
	import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

	public class StepDefinitions {
		WebDriver driver = WebDriverPage.getDriver();
	    org.pages.HomePage homePage = new org.pages.HomePage(driver);
	    org.pages.RegistrationPage registrationPage;
	    org.pages.LoginPage loginPage;

	    @Given("A user visits the website")
	    public void user_visits_website() {
	        homePage.navigateToHomePage();
	    }

	    @When("They enter valid registration details")
	    public void user_enters_registration_details() {
	        registrationPage = homePage.goToRegistrationPage();
	        registrationPage.fillRegistrationForm("John", "Doe", "john.doe@example.com", "Password123");
	        registrationPage.submitForm();
	    }

	    @Then("The account is created, and the user is logged in")
	    public void account_is_created() {
	        Assert.assertTrue(registrationPage.isAccountCreated());
	    }

	    @Given("A user is on the login page")
	    public void user_on_login_page() {
	        loginPage = homePage.goToLoginPage();
	    }

	    @When("They enter valid credentials")
	    public void user_enters_credentials() {
	        loginPage.login("john.doe@example.com", "Password123");
	    }

	    @Then("The user is redirected to their account dashboard")
	    public void user_logged_in() {
	        Assert.assertTrue(loginPage.isLoggedIn());
	    }
	}


