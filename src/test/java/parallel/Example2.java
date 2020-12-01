package parallel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Example2 {
	
	WebDriver driver;
	
	@Test(threadPoolSize=3,invocationCount=5,timeOut=10000)
	public void test1() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/v4/");
		driver.findElement(By.name("uid")).sendKeys("mngr294865");
		driver.findElement(By.name("password")).sendKeys("vUrYbag");
		WebElement element = driver.findElement(By.name("btnLogin"));
		element.click();
	}
	
	public void test2() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/v4/");
		driver.findElement(By.name("uid")).sendKeys("mngr294865");
		driver.findElement(By.name("password")).sendKeys("vUrYbag");
		WebElement element = driver.findElement(By.name("btnLogin"));
		element.click();
	}
	
	
}
