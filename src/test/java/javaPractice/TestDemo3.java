package javaPractice;

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

public class TestDemo3 {
	
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String url = "https://demoqa.com/select-menu";
		driver.get(url);	
		WebElement ddElement = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
		
		Select select = new Select(ddElement);
	
		
		List<WebElement> dropDowns = select.getOptions();
		String[] drdw=new String[dropDowns.size()];
			for(int i =0;i<dropDowns.size();i++) {
				drdw[i]= dropDowns.get(i).getText();
				
				
			}
			
		for(int i=0;i<drdw.length;i++) {
			for(int j=i+1;j<drdw.length;j++) {
				if(drdw[i].compareTo(drdw[j])>0) {
					String temp=drdw[i];
					drdw[i]=drdw[j];
					drdw[j]=temp;
					}
			}
		}for(int i=0;i<drdw.length;i++) {
			System.out.println(drdw[i]);
		}

	}
}