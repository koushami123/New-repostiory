package Demo_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Page {
	WebDriver driver;
	public Page(WebDriver driver){
		this.driver=driver;
	}
	
	@FindBy(name="userName")
	@CacheLookup
	WebElement username;
	
	@FindBy(how=How.NAME, using="password")
	@CacheLookup
	WebElement pass;
	
	@FindBy(name="login")
	@CacheLookup
	WebElement btn;
	
	public void login(String a,String b){
		username.sendKeys(a);
		pass.sendKeys(b);
		btn.click();
	}

	

}
