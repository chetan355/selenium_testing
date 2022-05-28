import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase2 {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver","D://selenium//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
//		System.out.println(driver.getPageSource());
//		System.out.println(driver.getCurrentUrl());
		driver.get("http://learncodeonline.in");
		
	}
}
