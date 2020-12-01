package jsExecutorExample;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class GenerateReport implements ITestListener {

	WebDriver driver=null;
	String filepath = "C:\\Users\\Harry\\eclipse-workspace\\JavaPractice\\Screenshot";
	@Override
	public void onFinish(ITestContext arg0) {
		System.out.println("onFinish");
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		
		System.out.println("onStart"+arg0.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		System.out.println("onTestFailedButWithinSuccessPercentage");
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		System.out.println("onTestFailure"+arg0.getName());
		
	
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
System.out.println("onTestSkipped");
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		System.out.println("onTestStart");
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		System.out.println("onTestSuccess");
		
	}

	
	
}
