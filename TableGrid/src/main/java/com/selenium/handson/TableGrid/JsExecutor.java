package com.selenium.handson.TableGrid;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	System.setProperty("webdriver.chrome.driver","./src/main/utilities/chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	
    	driver.get("https://www.google.com/");
    	
    	driver.findElement(By.name("q")).sendKeys("selenium");
    	System.out.println(driver.findElement(By.name("q")).getText());
    	
    	JavascriptExecutor js = (JavascriptExecutor)driver;
    	String script = "return document.getElementsByName(\"q\")[0].value;";
    	String res = (String)js.executeScript(script);
    	
    	//wanna to find out "selenium testing" in dropdown
    	
    	int res_num = 0;
    	while(!res.equalsIgnoreCase("selenium ")) {    		
        	res_num++;
    		driver.findElement(By.name("q")).sendKeys(Keys.DOWN);
        	res = (String)js.executeScript(script);
    	}
    	    	
		System.out.println(res_num);
    	
	}

}
