package First_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderSelenium {

	@Test(dataProvider = "datasetMethod1")
	public void data(String username, String password) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		
		driver.findElement(By.id("user-name")).sendKeys(username);
		
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(1000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(1000);

		driver.close();

	}

	@DataProvider
	public Object[][] datasetMethod1() {

		return new Object[][] {

				{ "standard_user", "secret_sauce" },
				{ "locked_out_user", "secret_sauce" }

		};

	}

}
