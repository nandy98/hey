package testk;

import java.io.File;

import org.apache.commons.logging.impl.Log4JLogger;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.spi.Configurator;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.restassured.config.Config;

public class Loggerprac {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		Logger log = Logger.getLogger("I Am Checking");
		PropertyConfigurator.configure("log4j.properties");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		log.info("Browser Launched");
		driver.manage().window().maximize();
		log.info("browser maximise");
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		log.info("website loaded");
		/*WebElement element = driver.findElement(By.xpath("//div[@class=' css-1hwfws3']"));*/
		Thread.sleep(3000);
		
		WebElement element = driver.findElement(By.name("country"));
		Select select = new Select(element);
		select.selectByVisibleText("INDIA");
		driver.quit();
	}
}
