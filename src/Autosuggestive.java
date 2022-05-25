import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Autosuggestive {

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
		driver.navigate().to("https://www.qaclickacademy.com/practice.php/");
		driver.findElement(By.id("autocomplete")).sendKeys("united");
		List<WebElement> list = driver.findElements(
				By.xpath("//ul[@class='ui-menu ui-widget ui-widget-content ui-autocomplete ui-front']/li"));

		System.out.println("Auto Suggest List ::" + list.size());

		for (int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i).getText());

			if (list.get(i).getText().equals("United States (USA)")) 
			{
				list.get(i).click();
				break;
			}
		}
		// System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("Value"));

	}

}
