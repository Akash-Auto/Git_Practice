package First_Project;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeClassDemo {

	@BeforeClass
	public void BeforeClassMethod() {
		
		System.out.println("Before class");
		
	}
	
	
	
	
	@Test(enabled = false)
	public void Test1() {
		
		System.out.println("Skipped Test1");
		
	}
	
	@Test
	public void Test2() {
		
		System.out.println("Skipped Test2");
		
	}
	
	@Test
	public void Test3() {
		
		System.out.println("Skipped Test3");
		
	}
	
	@Test
	public void Test4() {
		
		System.out.println("Skipped Test4");
		
	}
	
	

}
