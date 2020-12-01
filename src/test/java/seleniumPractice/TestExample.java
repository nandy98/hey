package seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
public class TestExample {

	@Test
	public void myTest() {
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/text-box");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
	WebDriverWait wait = new WebDriverWait(driver, 3);
	
	driver.findElement(By.id("userName")).sendKeys("Nandlal");
	driver.findElement(By.id("userEmail")).sendKeys("nky@gmail.com");
	WebElement currentAddress = driver.findElement(By.id("currentAddress"));
	currentAddress.sendKeys("A/516,BHuli,Dhanbad");

}}
