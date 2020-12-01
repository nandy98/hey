package seleniumPractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotExp {

	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.guru99.com/using-robot-api-selenium.html");
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);

	}

}
