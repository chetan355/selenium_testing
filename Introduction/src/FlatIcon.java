import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlatIcon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://selenium//chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.flaticon.com");
		driver.findElement(By.xpath("//*[@id=\"hero\"]/div/section/form/div[2]/input")).sendKeys("email");
		driver.findElement(By.xpath("//*[@id=\"hero\"]/div/section/form/button[2]")).click();
	}
}
