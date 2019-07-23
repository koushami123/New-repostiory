package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Demo_1.Page;
import Demo_1.UtilityClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Demo_1 {
	WebDriver driver;
	@Given("^User must be registered$")
	public void user_must_be_registered() throws Throwable {
	    driver=UtilityClass.startbrowser("chrome","http://newtours.demoaut.com/");
	}

	@When("^User enters valid credentials$")
	public void user_enters_valid_credentials() throws Throwable {
		Page page=PageFactory.initElements(driver,Page.class);
		page.login("mercury","mercury");
	    
	}

	@Then("^User must be in home page$")
	public void user_must_be_in_home_page() throws Throwable {
		WebDriverWait wait=new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("tripType")));
		Assert.assertEquals(driver.getTitle(), "Find a Flight: Mercury Tours:");
		driver.close();
	    
	}
}
