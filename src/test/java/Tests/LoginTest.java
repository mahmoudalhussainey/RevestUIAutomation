package Tests;

import base.BaseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.LoginPage;
import Pages.Logout;

public class LoginTest extends BaseTest {
	
	 @Test (priority = 1)
	    public void testLoginLogout() throws InterruptedException {
	        LoginPage loginPage = new LoginPage(driver);
	        
	        // Click on "Form Authentication"
	        driver.findElement(org.openqa.selenium.By.linkText("Form Authentication")).click();
	      
	        
	        // Perform login
	        loginPage.enterUsername("tomsmith");
	        loginPage.enterPassword("SuperSecretPassword!");
	        loginPage.clickLogin();
	        
	        // Validate login success message
	        String expectedMessage = "You logged into a secure area!";
	        Assert.assertTrue(loginPage.getFlashMessage().contains(expectedMessage), "Login failed!");
	        
//	      

	        // Perform logout
	        Logout securePage = new Logout(driver);
	        securePage.clickLogout();

	        // Validate logout success
	        Assert.assertTrue(loginPage.getFlashMessage().contains("You logged out"), "Logout failed!");
	    }
	 @Test  (priority = 2)
	 public void title() {
	        LoginPage loginPage = new LoginPage(driver);
	        String actualTitle = driver.getTitle();
	        Assert.assertTrue(loginPage.isTitleCorrect(), "Title is incorrect, expected 'Login Page'" + actualTitle);

		
		}
	 @Test  (priority = 3)// Failed test case to show the result failed and passed 
	 
	 public void Welcome_to_Secure_Area() {
		 Logout Logout = new Logout(driver);
	        String expectedSubheaderMessage = "Welcome to the Secure Area. When you are done click logout below.";
	        String actualSubheaderMessage = Logout.getSubheaderMessage();
	        Assert.assertEquals(actualSubheaderMessage, expectedSubheaderMessage, "Subheader message is incorrect!");

		}
	 
	 
	}


