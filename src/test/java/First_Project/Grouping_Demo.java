package First_Project;

import org.testng.Assert;
import org.testng.annotations.Test;


@Test(groups = "User")
public class Grouping_Demo {
	
	
	@Test(groups = "Regression")
	public void test1() {
		
		System.out.println("Test1");
		
	}
	
	@Test(groups = "Regression,Functional")
	public void test2() {
		
		System.out.println("Test2");
		
	}
	
	@Test(groups = "Regression,Functional")
	public void test3() {
		
		System.out.println("Test3");
		
	}
	
	@Test(groups = "Functional")
	public void test4() {
		
		System.out.println("Test4");
		Assert.assertTrue(false, "Test Case Failed Screenshot captured");
		
	}
	

}
