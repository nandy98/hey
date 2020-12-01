package testk;

public class MethodoverridingExample extends OverloadingExample {

	int x=10;
	int y=20;
	MethodoverridingExample() {
		super();
	}
	
	public void sum() {
		int sum=x+y;
		System.out.println(sum);
		int su= super.x+super.y;
		super.sum();
	}
	public int sum(int x) {
		int s=10;
		return s;
		
	}
	public static void main(String[] args) {
		
	}

}
