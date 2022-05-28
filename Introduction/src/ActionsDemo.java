import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://selenium//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		WebElement element = driver.findElement(By.cssSelector("span[id='nav-link-accountList-nav-line-1']"));
		
		actions.moveToElement(driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")))
		.click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		
		actions.moveToElement(element).build().perform();
		//right click
		actions.moveToElement(element).contextClick().build().perform();
		
	}

}
