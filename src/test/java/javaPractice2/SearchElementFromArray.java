package javaPractice2;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;

public class SearchElementFromArray {

	public static void main(String[] args) {
		
		int[] a={10,20,30,40,50,60};

		int search=20;
		
		for(int i=0;i<a.length;i++){
		if(a[i]==search){
		System.out.println("Element Found");
		break;
		}else{
		System.out.println("Element not present");
		}
		}
		
	}

}
