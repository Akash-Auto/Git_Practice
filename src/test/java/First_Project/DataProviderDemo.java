package First_Project;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	// First Way

	@Test(dataProvider = "datasetMethod")
	public void data(String username, String password) {

		System.out.println(username + "==========" + password);

	}

	@DataProvider
	public Object[][] datasetMethod() {

		Object[][] dataset = new Object[4][2];

		// first row
		dataset[0][0] = "user1";
		dataset[0][1] = "pass1";

		// second row
		dataset[1][0] = "user2";
		dataset[1][1] = "pass2";

		// Third row
		dataset[2][0] = "user3";
		dataset[2][1] = "pass3";

		// Fourth row
		dataset[3][0] = "user1";
		dataset[3][1] = "pass1";
		
		return dataset;

	}
		
		// Second Way

		@Test(dataProvider = "datasetMethod1")
		public void data(String username, String password,String Test) {

			System.out.println(username + "==========" + password+"======"+Test);

		}
		
		
	@DataProvider
		public Object[][] datasetMethod1(){
			
			return new Object[][]
					{
				
				{"username","password","Test"},
				{"username1","password1","Test1"}
			
					};
		
		
	}

}
