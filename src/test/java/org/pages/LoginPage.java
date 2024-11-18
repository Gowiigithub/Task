package org.pages;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;

	public class LoginPage extends BaseClass {

	    @FindBy(id = "email")
	    WebElement emailField;

	    @FindBy(id = "pass")
	    WebElement passwordField;

	    @FindBy(id = "send2")
	    WebElement signInButton;

	    @FindBy(css = "div.welcome-msg")
	    WebElement welcomeMessage;

	    public LoginPage(WebDriver driver) {
	        super(driver);
	    }

	    public void login(String email, String password) {
	        enterText(emailField, email);
	        enterText(passwordField, password);
	        clickElement(signInButton);
	    }

	    public boolean isLoggedIn() {
	        return isElementPresent(welcomeMessage);
	    }
	}


