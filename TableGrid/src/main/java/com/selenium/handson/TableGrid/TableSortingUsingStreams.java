package com.selenium.handson.TableGrid;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TableSortingUsingStreams {

	public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver","./src/main/utilities/chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
    	driver.findElement(By.xpath("//tr/th[1]")).click();
    	
    	List<WebElement> elements = driver.findElements(By.xpath("//tr/td[1]"));

    	List<String> original_list = elements.stream().map(s->s.getText()).collect(Collectors.toList());
    	
    	List<String> sorted_list = original_list.stream().sorted().collect(Collectors.toList());

    	    	
    	if(original_list.equals(sorted_list)) {
    		System.out.println("Veg sorted!");
    	}else {
    		System.out.println("Veg not sorted!");
    	}
    	
    	
    	List<String> price;    	
    	
    	//finding out the price of Rice in table : pagination demo
    	do 
    	{
        	elements = driver.findElements(By.xpath("//tr/td[1]"));
        	
        	price = elements.stream().filter(s->s.getText().contains("Beans"))
        			.map(s->getPriceOfVeggie(s)).collect(Collectors.toList());
        	
    		if(price.size()<1)
    			driver.findElement(By.cssSelector("[aria-label='Next']")).click();
    		
    	}while(price.size()<1);
    	
    	price.forEach(p->{
    		System.out.println(p);
    	});
    	driver.quit();
	}

	private static String getPriceOfVeggie(WebElement e) {
		// TODO Auto-generated method stub
		String pricev = e.findElement(By.xpath("following-sibling::td[1]")).getText();		
		return pricev;
	}

}
