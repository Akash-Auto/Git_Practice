package First_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertion {
	
	
	@Test
	public void titleTest() {

		// Softassert class
		
		SoftAssert soft = new SoftAssert();
		
		String expectedTitle = "Google";
		
		String expectedtext="q";

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.co.in/");

		String actualTitle = driver.getTitle();

		System.out.println("Title Verification");
		soft.assertEquals(actualTitle, expectedTitle,"Title is not matching");
		
		String actualtext=driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).getAttribute("name");

		System.out.println("Text Verification");
		soft.assertEquals(actualtext, expectedtext, "Text verifivation successful");
		
		soft.assertAll();
		
		driver.quit();
		
		
		
	}

}
