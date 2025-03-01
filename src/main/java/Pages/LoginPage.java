package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class LoginPage {
	  private WebDriver driver;
	    private WebDriverWait wait;

	    // Locators
	    private By title = By.xpath("//h2[normalize-space()='Login Page']");
	    private By usernameField = By.id("username");
	    private By passwordField = By.id("password");
	    private By loginButton = By.cssSelector("button.radius");
	    private By flashMessage = By.cssSelector("#flash");

	    public LoginPage(WebDriver driver) {
	        this.driver = driver;
	        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    }
	    public boolean isTitleCorrect() {
	        try {
	            WebElement titleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(title));
	            return titleElement.getText().equals("Login Page");
	        } catch (Exception e) {
	            return false;
	        }}

	    public void enterUsername(String username) {
	        driver.findElement(usernameField).sendKeys(username);
	    }

	    public void enterPassword(String password) {
	        driver.findElement(passwordField).sendKeys(password);
	    }

	    public void clickLogin() throws InterruptedException {
	        driver.findElement(loginButton).click();
//	        Thread.sleep(5000);
	    }

	    public String getFlashMessage() {
	        wait.until(ExpectedConditions.visibilityOfElementLocated(flashMessage));
	        return driver.findElement(flashMessage).getText();
	    }
	}


