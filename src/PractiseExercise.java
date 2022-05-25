import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PractiseExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C://Program Files (x86)//gecko driver//geckodriver.exe");
		//System.setProperty("webdriver.firefox.marionette", "C://Program Files (x86)//gecko driver//geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		options.setBinary("C://Program Files//Mozilla Firefox//firefox.exe");
		WebDriver driver = new FirefoxDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait W = new WebDriverWait(driver, Duration.ofSeconds(8));
		
		driver.get("http://google.com");
		driver.navigate().to("https://www.qaclickacademy.com/practice.php/");
		driver.findElement(By.xpath("//input[@value='option2']")).click();
		String Option = driver.findElement(By.xpath("//*[@id ='checkbox-example']/fieldset/label[2]")).getText();
		
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		
		Select dropdowns = new Select(dropdown);
		dropdowns.selectByVisibleText(Option);
		
		driver.findElement(By.name("enter-name")).sendKeys(Option);
		driver.findElement(By.id("alertbtn")).click();
		String S = driver.switchTo().alert().getText();
		
		if(S.contains(Option))
		{
			System.out.println("Alert message has the text");
			
		}
		
		else
		{
			System.out.println("Alert message is not having the text");
		}
		
		driver.switchTo().alert().accept();
		driver.close();

	}

}
