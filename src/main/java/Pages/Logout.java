package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class Logout {
	
	 private WebDriver driver;

//	    private By logoutButton = By.cssSelector("a.button");
//	 private By logoutButton = By.linkText("Logout");
	    private By subheaderMessage = By.cssSelector(".subheader");

private WebDriverWait wait;

	    public Logout(WebDriver driver) {
	        this.driver = driver;
	        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    }

	    public void clickLogout() {
	        driver.findElement(By.xpath("//i[@class='icon-2x icon-signout']")).click();
//	        (logoutButton).click();
	    }
	    public String getSubheaderMessage() {
	        WebElement messageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(subheaderMessage));
	        return messageElement.getText();
	    }

}
