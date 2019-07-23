package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Demo_1.UtilityClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Case_2 {
	WebDriver driver;
	@Given("^User is in Login page$")
	public void user_is_in_Login_page() throws Throwable {
		driver=UtilityClass.startbrowser("chrome","http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.partialLinkText("SignIn")).click();
	}

	@When("^user enters \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_enters(String arg1, String arg2) throws Throwable {
			driver.findElement(By.name("userName")).sendKeys(arg1);
			  driver.findElement(By.name("password")).sendKeys(arg2);	
	}

	@Then("^user is in home page$")
	public void user_is_in_home_page() throws Throwable {
		driver.findElement(By.name("Login")).click();
	    Assert.assertEquals(driver.getTitle(), "Home");
	    driver.close();
	}
}
