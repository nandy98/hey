package selenium;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeXPath {

	public static void main(String[] args) {
	
		Logger log = Logger.getLogger("I AM CKK");
		
		PropertyConfigurator.configure("log4j.properties");
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Driver/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		log.info("browser launch");
		driver.get("http://demo.guru99.com/V4/");
		log.info("Webpage Opened");
		
		driver.findElement(By.xpath("//input[starts-with(@type,'text')]")).sendKeys("hello");
		
		log.info("located and value sended");
		driver.quit();
	}

}
