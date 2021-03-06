package com.selenium.handson.TableGrid;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiverDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	System.setProperty("webdriver.chrome.driver","./src/main/utilities/chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://www.makemytrip.com/");
    	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    	
    	driver.findElement(By.id("fromCity")).click();
    	
    	driver.findElement(By.cssSelector("input[aria-controls='react-autowhatever-1']")).sendKeys("mum");
    	String keys = Keys.chord(Keys.ARROW_DOWN,Keys.ENTER);
    	driver.findElement(By.cssSelector("input[aria-controls='react-autowhatever-1']")).sendKeys(keys);    	
	}
}
