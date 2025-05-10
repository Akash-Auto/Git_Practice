package First_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitle {

	@Test
	public void titleTest() {

		String expectedTitle = "Google";

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.co.in/");

		String actualTitle = driver.getTitle();

		Assert.assertEquals(actualTitle, expectedTitle,"Title is not matching");
		System.out.println("Test case passed");

		driver.quit();
	}

}
