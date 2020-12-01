package testk;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestMyDemo.class)
public class pratice {

	@Test
	public void myTest() {
		int x=10;
		int y=20;
		int sum=x+y;
		System.out.println(sum);
	}
	public void myTest2() {
		int x=10;
		int y=20;
		int sum=x+y;
		System.out.println(sum);
	}
}
