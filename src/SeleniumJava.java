import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SeleniumJava {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// implicit wait - 2 seconds time out
		System.setProperty("webdriver.gecko.driver", "C://Program Files (x86)//gecko driver//geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		options.setBinary("C://Program Files//Mozilla Firefox//firefox.exe");
		WebDriver driver = new FirefoxDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://google.com");
		driver.navigate().to("https://www.facebook.com/");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-testid ='open-registration-form-button']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Vidya");
		driver.findElement(By.name("lastname")).sendKeys("D");
		driver.findElement(By.name("reg_email__")).sendKeys("vidyasri.d488@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("vidyasri.d488@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Vidya@123");
		driver.findElement(By.name("birthday_day")).sendKeys("27");
		driver.findElement(By.name("birthday_month")).sendKeys("Jul");

		driver.findElement(By.name("birthday_year")).sendKeys("1993");
		// input[@type = "date"]
		driver.findElement(By.cssSelector("input[value='1']")).click();

		Thread.sleep(2000);

		driver.findElement(By.name("websubmit")).click();

		driver.close();

	}
}
