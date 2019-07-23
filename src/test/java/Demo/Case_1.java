package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Demo_1.UtilityClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Case_1 {
	WebDriver driver;
	
	@Given("^User is in Sign up page$")
	public void user_is_in_Sign_up_page() throws Throwable {
		driver=UtilityClass.startbrowser("chrome","http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.partialLinkText("SignUp")).click();;
	}
	
	@When("^User enters username as \"([^\"]*)\",firstname as \"([^\"]*)\",lastname as \"([^\"]*)\", password as\"([^\"]*)\",confirm password as \"([^\"]*)\"$")
	public void user_enters_username_as_firstname_as_lastname_as_password_as_confirm_password_as(String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
		  driver.findElement(By.name("userName")).sendKeys(arg1);
		  driver.findElement(By.name("firstName")).sendKeys(arg2);
		  driver.findElement(By.name("lastName")).sendKeys(arg3);
		  driver.findElement(By.name("password")).sendKeys(arg4);
		  driver.findElement(By.name("confirmPassword")).sendKeys(arg5);
	}

	@When("^selects gender as female,email as \"([^\"]*)\",mobile no as\"([^\"]*)\"$")
	public void selects_gender_as_female_email_as_mobile_no_as(String arg1, String arg2) throws Throwable {
		 driver.findElement(By.xpath("//input[@value='Female']")).click();
		  driver.findElement(By.name("emailAddress")).sendKeys(arg1);
		  driver.findElement(By.name("mobileNumber")).sendKeys(arg2);
	}

	@When("^enters dob as \"([^\"]*)\", address as \"([^\"]*)\", selects one security question and enters answer as \"([^\"]*)\"$")
	public void enters_dob_as_address_as_selects_one_security_question_and_enters_answer_as(String arg1, String arg2, String arg3) throws Throwable {
		driver.findElement(By.name("dob")).sendKeys(arg1);
		  driver.findElement(By.name("address")).sendKeys(arg2);
		  Select sel=new Select(driver.findElement(By.name("securityQuestion")));
		  sel.selectByIndex(1);
		  driver.findElement(By.name("answer")).sendKeys(arg3);
	}

	
	@Then("^User must be in Login page$")
	public void user_must_be_in_Login_page() throws Throwable {
		driver.findElement(By.name("Submit")).click();
	    Assert.assertEquals(driver.getTitle(), "Login");
	    driver.close();
	}
}
