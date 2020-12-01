package javaPractice;

import java.util.Arrays;
import java.util.Scanner;

public class SortingCharString2 {

	public static void main(String[] args) {

		int temp;
		String str="Nandlal kumar Yadav Nandlal 1222111";
		
		//1.Logic to sorting string
		String lstr = str.toLowerCase();
		System.out.println(lstr);
		char[] charArr = lstr.toCharArray();
		
		System.out.println(charArr);
		
		for(int i=0;i<charArr.length;i++) {
			for(int j=i+1;j<charArr.length;j++){
				if(charArr[i]>charArr[j]) {
					temp=charArr[i];
					charArr[i]=charArr[j];
					charArr[j]=(char)temp;
				}
			}
		
		}System.out.println(Arrays.toString(charArr));
		
		
		
		//2.Logic to find third largest from string.
		System.out.println("n"+charArr[1]+"n");
		System.out.println(charArr[charArr.length-3]);
	}
}
