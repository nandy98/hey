package javaPractice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDemo {
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/tutor_connect/index.php");
		 driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	      Select s = new Select(driver.findElement(By.xpath("//select[@name='selType']")));
	      // getting the list of options in the dropdown with getOptions()
	      List <WebElement> op = s.getOptions();
	      ArrayList<String> al=new ArrayList<String>();
	      
	      int size = op.size();
	      for(int i =0; i<size ; i++){
	         String options = op.get(i).getText();
	         al.add(options);
	        // System.out.println(options);
	      }
	      
	      for(String str:al) {
	    	  System.out.println(str);
	      }
	      Collections.sort(al);
	      for(String str:al) {
	    	  System.out.println(str);
	      }
	      driver.quit();
	}
}