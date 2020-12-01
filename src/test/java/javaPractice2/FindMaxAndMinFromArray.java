package javaPractice2;

public class FindMaxAndMinFromArray {

	public static void main(String[] args) {
		int[] arr={10,20,30,40,50};
		int max=arr[0];
		int min=arr[0];

		for(int i=0;i<arr.length;i++){
		if(arr[i]>max){
		max=arr[i];
		}
		}
		for(int i=0;i<arr.length;i++){
		if(arr[i]<min){
		min=arr[i];
		}
		}

		System.out.println("minimum="+min);
		System.out.println("maximum="+max);

	}

}
