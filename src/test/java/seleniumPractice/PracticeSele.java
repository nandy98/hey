package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeSele {
	
	WebDriver driver;
	
	
	@Test
	public void chromeBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		/*WebElement element = driver.findElement(By.xpath("//div[@class=' css-1hwfws3']"));*/
		Thread.sleep(3000);
		
		WebElement element = driver.findElement(By.name("country"));
		Select select = new Select(element);
		select.selectByVisibleText("INDIA");
		driver.quit();
		
	}
	

}
