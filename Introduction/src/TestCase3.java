import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D://selenium//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://login.salesforce.com");
		System.out.println(driver.getTitle());
//		System.out.println(driver.getPageSource());
//		System.out.println(driver.getCurrentUrl());
//		driver.get("http://learncodeonline.in");
		driver.findElement(By.cssSelector("#username")).sendKeys("chetan1792000@gmail.com");
		driver.findElement(By.cssSelector("#password")).sendKeys("323205");
//		driver.findElement(By.xpath("//button[text()='Log In']")).click();
		driver.findElement(By.cssSelector("#Login")).click();
		
		System.out.println(driver.findElement(By.cssSelector("#error")).getText());
		
	}

}
