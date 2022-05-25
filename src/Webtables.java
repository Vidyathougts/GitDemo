import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Webtables {
	
	public static void main(String[] args) {
	
	System.setProperty("webdriver.gecko.driver", "C://Program Files (x86)//gecko driver//geckodriver.exe");
	//System.setProperty("webdriver.firefox.marionette", "C://Program Files (x86)//gecko driver//geckodriver.exe");
	FirefoxOptions options = new FirefoxOptions();
	options.setBinary("C://Program Files//Mozilla Firefox//firefox.exe");
	WebDriver driver = new FirefoxDriver(options);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait W = new WebDriverWait(driver, Duration.ofSeconds(8));
	
	driver.get("http://google.com");
	driver.navigate().to("https://www.qaclickacademy.com/practice.php/");
	
	WebElement table = driver.findElement(By.xpath("//table[@id='product']"));
	
	 System.out.println(table.findElements(By.tagName("tr")).size());
	 System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
	 System.out.println(table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td")).size());
	 
	 List<WebElement> secondrow = table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
	 
	 

	 
	 System.out.println(secondrow.get(0).getText());
	 System.out.println(secondrow.get(1).getText());
	 System.out.println(secondrow.get(2).getText());
}
}
