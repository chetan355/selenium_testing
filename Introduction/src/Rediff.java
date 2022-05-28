import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D://selenium//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
//		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.cssSelector("#email")).sendKeys("chetan1792000@gmail.com");
		driver.findElement(By.cssSelector("#pass")).sendKeys("323205");
		driver.findElement(By.cssSelector("button[name='login']")).click();
	}
}
