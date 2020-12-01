package javaPrac;

public class Testt {

	
	public static void main(String[] args) {
		int arr[]= {2,3,4,5,6,1,8};
		
		int temp[]=new int[arr.length-1];
		int j=0;
		int index =5;
		
		for(int i=0;i<arr.length;i++) {
			
			if(i==index) {
				continue;
			}else  {
				temp[j]=arr[i];
				j++;
			}
		}
		//System.out.println(j);
		//System.out.println(temp.length);
	
		for(int i=0;i<temp.length;i++) {
			System.out.println(temp[i]);
		}
	}
}
