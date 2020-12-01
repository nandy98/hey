package javaPractice2;

public class FindOddAndEvenFromArray {

	public static void main(String[] args) {
		int[] elements={10,20,30,40,50,60,11};

		for(int i=0;i<elements.length;i++){
		if(elements[i]%2==0){
		System.out.println("Even Number"+elements[i]);
		}else{
		System.out.println("odd Number"+elements[i]);
		}
		}

	}

}
