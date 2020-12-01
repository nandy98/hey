package testk;

public class OverloadingExample {

	
	int x=10;
	int y=20;
	OverloadingExample() {
		System.out.println("hey");
	}
	OverloadingExample(int x) {
		this();
		
	}
	
	public void sum() {
		int sum=x+y;
		System.out.println(sum);
		
	}
	public void s() {
		
		int sum=x+y;
		System.out.println(sum);
		this.sum();
		
		
	}
	public int sum(int x) {
		this.x=x;
		int s=10;
		return s;
		
		
	}
	public static void main(String[] args) {
		
	}

	
	
}
