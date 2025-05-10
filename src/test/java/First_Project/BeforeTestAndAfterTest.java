package First_Project;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeTestAndAfterTest {
	
	@BeforeTest
	public void LogintoApplication() {
		
		System.out.println("Login To Application");
		
	}
	
	@AfterTest
	public void lLogoutFromApplication() {
		
		System.out.println("Logout from Application");
		
	}
	

	@Test(priority = 1, description = "This is Login Test")

	public void Test1() {

		System.out.println("Test1");

	}

	@Test(priority = 2, description = "This is logout Test")

	public void Test2() {

		System.out.println("Test2");

	}

	@Test(priority = 3, description = "This is Login Test")

	public void Test3() {

		System.out.println("Test3");

}

}