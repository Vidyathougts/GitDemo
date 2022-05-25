import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginpagepractise {
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "C://Program Files (x86)//gecko driver//geckodriver.exe");
	//System.setProperty("webdriver.firefox.marionette", "C://Program Files (x86)//gecko driver//geckodriver.exe");
	FirefoxOptions options = new FirefoxOptions();
	options.setBinary("C://Program Files//Mozilla Firefox//firefox.exe");
	WebDriver driver = new FirefoxDriver(options);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait W = new WebDriverWait(driver, Duration.ofSeconds(8));
	
	driver.get("http://google.com");
	driver.navigate().to("https://www.rahulshettyacademy.com/loginpagePractise/");
	driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
	driver.findElement(By.id("password")).sendKeys("learning");
	driver.findElement(By.xpath("//input[@value='user']")).click();
	W.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
	
	driver.findElement(By.id("okayBtn")).click();
	WebElement dropdown = driver.findElement(By.xpath("//select[@class='form-control']"));
	
	Select dropdowns = new Select(dropdown);
	dropdowns.selectByValue("teach");
	System.out.println(dropdowns.getFirstSelectedOption().getText());
	
	driver.findElement(By.id("terms")).click();
	
	driver.findElement(By.id("signInBtn")).click();
	
	W.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
	List<WebElement> product = driver.findElements(By.xpath("//div[@class='card-footer']/button[@class='btn btn-info']"));
	for (int i=1;i<product.size();i++)
	{
		product.get(i).click();
	}
	
	driver.findElement(By.partialLinkText("Checkout")).click();
	W.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("ProtoCommerce Home")));
	driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
	
	//driver.switchTo().alert().accept();
	
	driver.close();

}
}
