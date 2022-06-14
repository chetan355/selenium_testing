package com.selenium.handson.DataDriven1.myddt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Housing {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./src/test/utilities/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	}
}
