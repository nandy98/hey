package javaPractice2;

public class RevOfNumber {

	public static void main(String[] args) {
		int num=12345;
		int rev=0;
/*
		while(num>0){
		rev=rev*10+num%10;
		num=num/10;
		}

		System.out.println(rev);*/	

		String n=String.valueOf(num);

		StringBuffer sb=new StringBuffer(n);
		System.out.println(sb.reverse());

	}

}
