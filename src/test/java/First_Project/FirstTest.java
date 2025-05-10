package First_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {

	
	  @Test(priority = 1,description = "This is Login Test")
	   
		public void LoginTest() {
		 
		System.out.println("Login Test");

		}
	  
	  @Test(priority = 2,description = "This is logout Test")
	   
		public void LogoutTest() {
		 
		System.out.println("LogOut Test");

		}

}
