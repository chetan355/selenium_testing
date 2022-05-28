import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://selenium//chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
//		driver.get("https://www.spicejet.com/");
		driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
		
		Select select = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		select.selectByIndex(2);
//		driver.findElement(By.cssSelector("#main-container > div > div.css-1dbjc4n.r-14lw9ot > div.css-1dbjc4n.r-14lw9ot.r-z2wwpe.r-vgw6uq.r-156q2ks.r-urutk0.r-8uuktl.r-136ojw6 > div.css-1dbjc4n.r-1pcd2l5.r-1uwte3a.r-m611by.r-bnwqim > div.css-1dbjc4n.r-18u37iz.r-19h5ruw.r-184en5c > div.css-1dbjc4n > div > div.css-1dbjc4n.r-14lw9ot.r-11u4nky.r-z2wwpe.r-1phboty.r-rs99b7.r-1loqt21.r-13awgt0.r-ymttw5.r-5njf8e.r-1otgn73 > div.css-1dbjc4n.r-1awozwy.r-18u37iz.r-1wtj0ep")).click();
//		driver.findElement(By.cssSelector("#main-container > div > div.css-1dbjc4n.r-14lw9ot > div.css-1dbjc4n.r-14lw9ot.r-z2wwpe.r-vgw6uq.r-156q2ks.r-urutk0.r-8uuktl.r-136ojw6 > div.css-1dbjc4n.r-1pcd2l5.r-1uwte3a.r-m611by.r-bnwqim > div.css-1dbjc4n.r-18u37iz.r-19h5ruw.r-184en5c > div.css-1dbjc4n > div > div.css-1dbjc4n.r-14lw9ot.r-z2wwpe.r-1rjd0u6.r-1g94qm0.r-h3f8nf.r-u8s1d.r-13qz1uu.r-8fdsdq > div.css-1dbjc4n.r-150rngu.r-eqz5dr.r-16y2uox.r-1wbh5a2.r-11yh6sk.r-1rnoaur.r-1sncvnh > div > div:nth-child(1) > div:nth-child(1) > div.css-1dbjc4n.r-1awozwy.r-18u37iz > div.css-1dbjc4n.r-1awozwy.r-19m6qjp.r-y47klf.r-1loqt21.r-eu3ka.r-1777fci.r-1otgn73.r-eafdt9.r-1i6wzkk.r-lrvibr.r-1aockid")).click();
//		driver.findElement(By.cssSelector("#main-container > div > div.css-1dbjc4n.r-14lw9ot > div.css-1dbjc4n.r-14lw9ot.r-z2wwpe.r-vgw6uq.r-156q2ks.r-urutk0.r-8uuktl.r-136ojw6 > div.css-1dbjc4n.r-1pcd2l5.r-1uwte3a.r-m611by.r-bnwqim > div.css-1dbjc4n.r-18u37iz.r-19h5ruw.r-184en5c > div.css-1dbjc4n > div > div.css-1dbjc4n.r-14lw9ot.r-z2wwpe.r-1rjd0u6.r-1g94qm0.r-h3f8nf.r-u8s1d.r-13qz1uu.r-8fdsdq > div.css-1dbjc4n.r-150rngu.r-eqz5dr.r-16y2uox.r-1wbh5a2.r-11yh6sk.r-1rnoaur.r-1sncvnh > div > div.css-1dbjc4n.r-obd0qt.r-k8qxaj.r-d9fdf6 > div")).click();
		
		
		//auto-suggestive dropdown
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement option : options)
		{
			System.out.println(option.getText());
			if(option.getText().equals("India")) {
				option.click();
				break;
			}
		}
		
		//checkbox handling
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount]")).isSelected());
		
		driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount]")).click();
//		System.out.println(driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount]")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount]")).isSelected());
		
		
		//calendar
		
		
	}
}
