package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test2 {

	@Test(dataProvider = "getData")
	public void model(String username,String password) {
		System.out.println("MT15 2.0");
		System.out.println(username);
		System.out.println(password);
	}
	
	@BeforeSuite
	public void suiteTest() {
		System.out.println("Executes before suite");
	}
	
	@AfterSuite
	public void suiteTest1() {
		System.out.println("Execute after suite");
	}
	
	@Test(groups = "Smoke")
	public void price() {
		System.out.println("2,00,000");
	}

	@BeforeTest
	public void preqreq() {
		System.out.println("Model is ready");
		
	}
	
	@DataProvider
	
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		//1st set		
		data[0][0] = "user_1";
		data[0][1] = "pass_1";
		
		//2nd set		
		data[1][0] = "user_2";
		data[1][1] = "pass_2";
		
		//3rd set		
		data[2][0] = "user_3";
		data[2][1] = "pass_3";
		
		return data;
	}
	
	
}
