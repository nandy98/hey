package javaPractice2;

public class CountEvenAndCountOdd {

	public static void main(String[] args) {
		int num=12345;

		int ecount=0;
		int ocount=0;

		int check;

		while(num>0){
		check=num%10;
		num=num/10;
		if(check%2==0) {
		ecount++;
		}else{
		ocount++;
		}}

		System.out.println("ecount ="+ecount+","+"ocount ="+ocount);


	}

}
