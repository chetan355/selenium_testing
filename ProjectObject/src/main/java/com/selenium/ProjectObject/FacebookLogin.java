package com.selenium.ProjectObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookLogin {

	WebDriver driver;
	
	public FacebookLogin(WebDriver driver) {
		this.driver = driver;
	}
	
	By username = By.xpath(".//*[@id='email']");
	By password = By.xpath(".//*[@id='pass']");
	By login_btn = By.xpath(".//*[@name='login']");
	
	public WebElement emailId() {
		return driver.findElement(username);
	}
	
	public WebElement pass() {
		return driver.findElement(password);
	}
	public WebElement btn() {
		return driver.findElement(login_btn);
	}
	
}
