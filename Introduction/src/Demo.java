import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo 
{
	public static void main(String[] args) 
	{
		//create driver object for chrome browser
		
		
		//we will strictly implement methods of web driver.
		
		//invoke .exe first
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://youtube.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getPageSource());
		driver.get("http://learncodeonline.in");
		driver.navigate().back();
		driver.close();
		driver.quit();
	}

}
