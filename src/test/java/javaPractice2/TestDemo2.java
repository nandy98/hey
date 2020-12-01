package javaPractice2;

import java.util.Arrays;

public class TestDemo2 {
	
	public static void main(String[] args)  {
	
		
		int [] num= {1,2,3,0,8,6};
		
		int n = num.length;
		
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]>num[j]) {
					int tmp=num[i];
					num[i]=num[j];
					num[j]=tmp;
					
					
				}
			}
		}System.out.println(Arrays.toString(num));
	
	}
}