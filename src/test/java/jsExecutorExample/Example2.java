package jsExecutorExample;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Example2 {
	
	WebDriver driver;
	@Test
	public void clickOnElement() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/v4/");
		driver.findElement(By.name("uid")).sendKeys("mngr294865");
		driver.findElement(By.name("password")).sendKeys("vUrYbag");
		WebElement element = driver.findElement(By.name("btncLogin"));
		
		Set<String> obj = driver.getWindowHandles();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		
		WebDriverWait wait =new WebDriverWait(driver,4);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		safeClickOnJavaScriptButton(element);
	
	}
	public void safeClickOnJavaScriptButton(WebElement element) {
		try {
			if(element.isEnabled()&&element.isDisplayed()) {
				((JavascriptExecutor) driver).executeAsyncScript("arguments[0].click();", element);
			}else {
				System.out.println("unable to click");
			}
		}catch(StaleElementReferenceException e){
			System.out.println(e.getStackTrace());
		}
		catch(NoSuchElementException e) {
			System.out.println(e.getStackTrace());
		}
	}
}
