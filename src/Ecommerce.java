import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Ecommerce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// implicit wait - 2 seconds time out
		System.setProperty("webdriver.gecko.driver", "C://Program Files (x86)//gecko driver//geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		options.setBinary("C://Program Files//Mozilla Firefox//firefox.exe");
		WebDriver driver = new FirefoxDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait W = new WebDriverWait(driver, Duration.ofSeconds(8));
		driver.get("http://google.com");
		driver.navigate().to("https://www.flipkart.com");
		// WebElement login =
		// driver.findElement(By.xpath("//a[@href='/account/login?ret=/']"));
		// login.click();

		driver.findElement(By.xpath("//div[@class='IiD88i _351hSN']/input[@type='text']")).sendKeys("7353059766");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Vidya@1993");
		driver.findElement(By.xpath("//div[@class='_1D1L_j']/button[@type='submit']")).click();
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("Mobiles");
		driver.findElement(By.xpath("//div[@class='_1HeMA2' or @class = 'lrtEPN _17d0yO']")).click();
		driver.findElement(By.xpath("//div[@class='col col-7-12']/div[@class='_4rR01T']")).click();
		driver.findElement(By.linkText("ADD TO CART")).click();
		
		driver.close();

	}
}