import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Frames {

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
		
		driver.findElement(By.cssSelector("a[href='/nested_frames']")).click();
		driver.switchTo().frame(driver.findElement(By.name("frame-top")));
		driver.switchTo().frame(driver.findElement(By.name("frame-middle")));
		System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());
		driver.switchTo().defaultContent();
		System.out.println(driver.findElements(By.tagName("frame")).size());
		

	}

}
