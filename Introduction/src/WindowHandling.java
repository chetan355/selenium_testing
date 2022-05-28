import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://selenium//chromedriver.exe");
		WebDriver driver  = new ChromeDriver();				
		driver.get("https://myaccount.google.com/?utm_source=sign_in_no_continue&pli=1");
//		driver.findElement(By.xpath(null))
	}

}
