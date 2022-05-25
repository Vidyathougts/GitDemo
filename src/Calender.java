import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C://Program Files (x86)//gecko driver//geckodriver.exe");
		// System.setProperty("webdriver.firefox.marionette", "C://Program Files
		// (x86)//gecko driver//geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		options.setBinary("C://Program Files//Mozilla Firefox//firefox.exe");
		WebDriver driver = new FirefoxDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait W = new WebDriverWait(driver, Duration.ofSeconds(8));

		driver.get("http://google.com");
		driver.navigate().to("https://www.path2usa.com/travel-companions");
		driver.findElement(By.id("travel_date")).click();

		driver.findElement(By.cssSelector("div[class='datepicker-days'] th[class='datepicker-switch']")).getText()
				.contains("July");

		while (!driver.findElement(By.cssSelector("div[class='datepicker-days'] th[class='datepicker-switch']")).getText()
				.contains("July")) {
			driver.findElement(By.cssSelector("div[class='datepicker-days'] th[class='next']")).click();
		}

		List<WebElement> days = driver.findElements(By.className("day"));
		int count = driver.findElements(By.className("day")).size();

		for (int i = 0; i < count; i++) {
			String s = driver.findElements(By.className("day")).get(i).getText();

			if (s.equalsIgnoreCase("11")) {
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}

	}

}
