package javaPractice2;

import java.util.Arrays;

public class EqualityOfTwoArrays {

	public static void main(String[] args) {

		int[] a={10,20,30,40,50,60,29};

		int[] b={10,20,30,40,50,60};

		boolean status = Arrays.equals(a,b);

		if(status==true){
		System.out.println("Arrays Equal");
		}else{
		System.out.println("Arrays are not Equal");}

	}

}
