package com.selenium.handson.TableGrid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.chrome.driver","./src/main/utilities/chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://www.cricbuzz.com/live-cricket-scorecard/47591/lsg-vs-rcb-eliminator-indian-premier-league-2022");
    	
    	WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
    	
    	int countrows = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
    	
    	
    	int countcolumns = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
    	
    	int score_sum = 0;
    	for(int i = 0; i < countcolumns-2; i++) {
    		String score = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
    		score_sum+=Integer.parseInt(score);
    		System.out.println(score);
    	}
    	
    	//sibling to sibling transfer
    	int extras = Integer.parseInt(table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText());
    	int total = Integer.parseInt(table.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());
    	
    	if((score_sum+extras)==total) 
    	{
    		System.out.println("Test Passed");
    	}else {
    		System.out.println("Test Failed ");
    	}
    	driver.quit();
    }
}
