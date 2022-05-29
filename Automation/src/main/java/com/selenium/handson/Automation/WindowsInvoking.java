package com.selenium.handson.Automation;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsInvoking {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://selenium//chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://rahulshettyacademy.com/");
		
		String course_name = driver.findElements(By.cssSelector("a[href='https://courses.rahulshettyacademy.com/p/get-access-to-all-courses']")).get(1).getText();
		
		Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> it = windows.iterator();
		
		String parentwindow = it.next();
		
		String childwindow = it.next();
		
		driver.switchTo().window(parentwindow);

		WebElement name = driver.findElement(By.cssSelector("[name='name']"));
		name.sendKeys(course_name);
		
		File file = name.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file, new File("logo.png"));
		
		int height = name.getRect().getDimension().getHeight();
		int width = name.getRect().getDimension().getWidth();
		
		System.out.println("Height : "+height+"Width : "+width);
	}

}
