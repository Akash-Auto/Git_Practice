package First_Project;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReportTest {
	
	@Test
	public void test1() {
		
		System.out.println("Test1");
		
	}
	
	@Test
	public void test2() {
		
		System.out.println("Test2");
		
	}
	@Test
	public void test3() {
		
		System.out.println("Test3");
		
	}
	@Test
	public void test4() {
		
		Reporter.log("This is Test 4");
		System.out.println("Test4");
		
	}

}
