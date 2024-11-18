package org.pages;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;

	public class HomePage extends BaseClass {

	    @FindBy(linkText = "Create an Account")
	    WebElement createAccountLink;

	    @FindBy(linkText = "Sign In")
	    WebElement signInLink;

	    public HomePage(WebDriver driver) {
	        super(driver);
	    }

	    public void navigateToHomePage() {
	        driver.get("https://magento.softwaretestingboard.com/");
	    }

	    public RegistrationPage goToRegistrationPage() {
	        clickElement(createAccountLink);
	        return new RegistrationPage(driver);
	    }

	    public LoginPage goToLoginPage() {
	        clickElement(signInLink);
	        return new LoginPage(driver);
	    }
	}

