package Demo;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import Demo_1.UtilityClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Case_4 {
	WebDriver driver;
	WebElement cart;
	@Given("^User is in Login Page$")
	public void user_is_in_Login_Page() throws Throwable {
		driver=UtilityClass.startbrowser("chrome","http://10.232.237.143:443/TestMeApp/");
		driver.findElement(By.partialLinkText("SignIn")).click();
	    
	}
	
	@When("^User enters valid username and password$")
	public void user_enters_valid_username_and_password() throws Throwable {
		driver.findElement(By.name("userName")).sendKeys("Lalitha");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.name("Login")).click();    
	}

	@Then("^User directed to home page$")
	public void user_directed_to_home_page() throws Throwable {
		Assert.assertEquals(driver.getTitle(), "Home");	    
	}

	@Given("^User is in home page$")
	public void user_is_in_home_page() throws Throwable {
		String a = driver.findElement(By.className("nav")).getText();
		Assert.assertTrue(a.contains("Lalitha"));
	}

	@When("^User searched an item$")
	public void user_searched_an_item() throws Throwable {
		Actions act=new Actions(driver);
		driver.findElement(By.id("myInput")).sendKeys("head");
		Thread.sleep(5000);
		act.sendKeys(Keys.ARROW_DOWN).click().build().perform();
		driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
	}

	
	@When("^Proceed with payment after adding the item$")
	public void proceed_with_payment_after_adding_the_item() throws Throwable {
		Assert.assertEquals(driver.getTitle(), "Search");
		driver.findElement(By.partialLinkText("Add")).click();
	    
	}

	@Then("^User should be directed to payment page$")
	public void user_should_be_directed_to_payment_page() throws Throwable {
		cart = driver.findElement(By.partialLinkText("Cart"));
		driver.findElement(By.partialLinkText("Cart")).click();
		Assert.assertEquals(driver.getTitle(), "View Cart");
		driver.close();
	}
	@When("^Attempt to proceed payment without adding the item$")
	public void attempt_to_proceed_payment_without_adding_the_item() throws Throwable {
		boolean a = isElementPresent();
		Assert.assertFalse(a);
	}
	
	private boolean isElementPresent() {
		    try {
		        driver.findElement(By.partialLinkText("Cart"));
		        return true;
		    } catch (org.openqa.selenium.NoSuchElementException e) {
		        return false;
		    }
	}

	@Then("^The cart icon should not be dispalyed$")
	public void the_cart_icon_should_not_be_dispalyed() throws Throwable {
		Assert.assertEquals(driver.getTitle(), "Search");
		driver.close();
	    
	}

}
