package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Test1 
{
	@AfterTest
	public void atEnd() {
		System.out.println("After test");
	}
	@BeforeMethod
	public void beforeeverymethod() {
		System.out.println("Before every method");
	}
	@Test(groups = "Smoke")
	public void msg() {
		System.out.println("Hello");
	}
	@Test(dependsOnMethods = "msg")
	public void abc() {
		System.out.println("just demo");
	}
	
	@Parameters("URL")
	@Test
	public void parameterTesting(String url) {
		System.out.println(url);
		Assert.assertTrue(false);
	}
	
	@Parameters({"username","pass"})
	@Test
	public void credentials(String username, String password) {
		System.out.println("Username : "+username);
		System.out.println("Password : "+password);
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("before class");
	}
}