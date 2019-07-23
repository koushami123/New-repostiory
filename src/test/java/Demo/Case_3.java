package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import Demo_1.UtilityClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Case_3 {
	WebDriver driver;
	@Given("^User should be logged in$")
	public void user_should_be_logged_in() throws Throwable {
		driver=UtilityClass.startbrowser("chrome","http://10.232.237.143:443/TestMeApp/");
		driver.findElement(By.partialLinkText("SignIn")).click();
		driver.findElement(By.name("userName")).sendKeys("Lalitha");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.name("Login")).click();  
	}

	@When("^user search for an item and purchase it$")
	public void user_search_for_an_item_and_purchase_it() throws Throwable {
		Actions act=new Actions(driver);
		driver.findElement(By.id("myInput")).sendKeys("head");
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_DOWN).click().build().perform();
		  driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
		  Assert.assertEquals(driver.getTitle(),"Search");
		  driver.findElement(By.partialLinkText("Add")).click();
		  driver.findElement(By.partialLinkText("Cart")).click();
		  Assert.assertEquals(driver.getTitle(),"View Cart");
		  driver.findElement(By.partialLinkText("Checkout")).click();
		  driver.findElement(By.xpath("//input[@value='Proceed to Pay']")).click();
	}

	@Then("^User should log out$")
	public void user_should_log_out() throws Throwable {
	    driver.close();
	}
}
