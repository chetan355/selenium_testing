import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://selenium//chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		WebElement element = driver.findElement(By.cssSelector("input[class='react-autosuggest__input react-autosuggest__input--open']"));
		
		element.clear();
		element.sendKeys("mum");
		Thread.sleep(2000);
		element.sendKeys(Keys.ARROW_DOWN);
		element.sendKeys(Keys.ENTER);
//		driver.findElement(By.cssSelector(".react-autosuggest__input react-autosuggest__input--open"));		
	}

}
