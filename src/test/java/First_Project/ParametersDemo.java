package First_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParametersDemo {
	
	public static WebDriver driver;
	
	
	@Parameters({"browser"})
	@Test
	public void LaunchingApplication(String browser) throws InterruptedException {
		
		if(browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
		
		driver.get("https://www.saucedemo.com/v1/");
		Thread.sleep(1000);
		driver.quit();
	}
	

}
