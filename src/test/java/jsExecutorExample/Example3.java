package jsExecutorExample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example3 {
	WebDriver driver;
	@Test
	public void clickOnElement() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/v4/");
		driver.findElement(By.name("uid")).sendKeys("mngr294865");
		driver.findElement(By.name("password")).sendKeys("vUrYbag");
		WebElement element = driver.findElement(By.name("btnLogin"));
		//safeClickOnJavaScriptButton(element);
	}
	
	public void safeClickOnJavaScriptButton(WebElement element) {
		
		try {
			if(element.isEnabled()&&element.isDisplayed()) {
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
			}else {
				System.out.println("");
			}
		}catch(StaleElementReferenceException e) {
			System.out.println(e.getStackTrace());
			
		} catch(NoSuchElementException e) {
			System.out.println(e.getStackTrace());
			
		}
		
	}
}
