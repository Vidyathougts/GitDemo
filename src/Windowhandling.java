import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Windowhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C://Program Files (x86)//gecko driver//geckodriver.exe");
		//System.setProperty("webdriver.firefox.marionette", "C://Program Files (x86)//gecko driver//geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		options.setBinary("C://Program Files//Mozilla Firefox//firefox.exe");
		WebDriver driver = new FirefoxDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://google.com");
		driver.navigate().to("https://the-internet.herokuapp.com");
		driver.findElement(By.partialLinkText("Windows")).click();
		driver.findElement(By.partialLinkText("Click Here")).click();
		Set<String> window=driver.getWindowHandles();
		Iterator<String> ite = window.iterator();
		String ParentID = ite.next();
		String ChildID = ite.next();
		driver.switchTo().window(ChildID);
		WebDriverWait W = new WebDriverWait(driver, Duration.ofSeconds(8));
		
		System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
		driver.switchTo().window(ParentID);
		System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
		

	}

}
