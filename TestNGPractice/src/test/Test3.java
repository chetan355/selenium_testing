package test;

import org.testng.annotations.Test;

public class Test3 {

	@Test
	public void webLogin() {
		System.out.println("Web Checked");
	}
	
	@Test(groups = "Smoke")
	public void mobileLogin() {
		System.out.println("Mobile Checked");
		
	}
	
	@Test(enabled=false)
	public void desktopLogin() {
		System.out.println("Desktop login");
		
	}
	@Test
	public void desktopSignin() {
		System.out.println("Desktop Checked");
		
	}
	@Test(timeOut = 4000)
	public void desktopSignout() {
		System.out.println("Desktop Checked");
		
	}
}
