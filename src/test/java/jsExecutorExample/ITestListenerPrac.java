package jsExecutorExample;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(GenerateReport.class)
public class ITestListenerPrac {

	@Test
	public void sum() {
		int sum = 10;
	}

	@Test
	public void sum2() {
		Assert.assertEquals(1, 2);
	}

	@Test(dependsOnMethods = "sum2")
	public void sum3() {
		Assert.assertEquals(1, 1);
	}

	@Test
	public void sum4() {
		int sum = 10;
	}
}
