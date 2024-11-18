package org.pages;
	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import java.time.Duration;

	public class BaseClass {
	    public WebDriver driver;
	    public WebDriverWait wait;

	    public BaseClass(WebDriver driver) {
	        this.driver = driver;
	        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        PageFactory.initElements(driver, this);
	    }

	    protected void clickElement(WebElement element) {
	        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	    }

	    protected void enterText(WebElement element, String text) {
	        wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
	    }

	    protected boolean isElementPresent(WebElement element) {
	        try {
	            wait.until(ExpectedConditions.visibilityOf(element));
	            return true;
	        } catch (Exception e) {
	            return false;
	        }
	    }

}
