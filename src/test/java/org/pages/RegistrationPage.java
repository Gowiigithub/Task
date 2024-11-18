package org.pages;
	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;

	public class RegistrationPage extends BaseClass {

	    @FindBy(id = "firstname")
	    WebElement firstNameField;

	    @FindBy(id = "lastname")
	    WebElement lastNameField;

	    @FindBy(id = "email_address")
	    WebElement emailField;

	    @FindBy(id = "password")
	    WebElement passwordField;

	    @FindBy(id = "password-confirmation")
	    WebElement confirmPasswordField;

	    @FindBy(css = "button[title='Create an Account']")
	    WebElement createAccountButton;

	    @FindBy(css = ".message-success")
	    WebElement successMessage;

	    public RegistrationPage(WebDriver driver) {
	        super(driver);
	    }

	    public void fillRegistrationForm(String firstName, String lastName, String email, String password) {
	        enterText(firstNameField, firstName);
	        enterText(lastNameField, lastName);
	        enterText(emailField, email);
	        enterText(passwordField, password);
	        enterText(confirmPasswordField, password);
	    }

	    public void submitForm() {
	        clickElement(createAccountButton);
	    }

	    public boolean isAccountCreated() {
	        return isElementPresent(successMessage);
	    }

}
