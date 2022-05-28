import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.util.TimeUtils;

import java.time.Duration;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Ecommerce 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D://selenium//chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		String products[] = {"Cucumber","Carrot","Mango"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise");
		//implicit wwait
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//		Thread.sleep(3000);
		List<WebElement> elements = driver.findElements(By.cssSelector("h4.product-name"));
		System.out.println(elements.size());
		List<String> list = Arrays.asList(products);
		int j = 0;
		for(int i = 0; i < elements.size(); i++) {
			if(j == products.length) {
				break;
			}
			String text = elements.get(i).getText();
			
			String arr[] = text.split("-");
			
			String formattedText = arr[0].trim();
			if(list.contains(formattedText)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
			}
		}		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		//explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
	}
}
