package javaPractice2;

public class PrimeOrNot {

	public static void main(String[] args) {
		int num=106;
		int count=0;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count>0) {
			System.out.println("Number is NOt Prime");
		}else {
			System.out.println("Number is Prime");
		}
	}

}
