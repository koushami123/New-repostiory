package Demo_1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UtilityClass {
	static WebDriver driver;
	public static WebDriver startbrowser(String a,String b){
		if(a.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\SeleniumDrivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(a.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\k.cyril.joseph\\Downloads\\chromedriver_win32\\chromedriver.exe");
	        	driver= new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get(b);
		return driver;
	}

}
