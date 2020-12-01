package javaPractice2;

import java.util.Arrays;
import java.util.Scanner;

public class SortingWordOfString {

	public static void main(String[] args) {
		System.out.println("Enter the Num of Word Count:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Scanner sca = new Scanner(System.in);
		String ns;
		String names[] = new String[n];
		String[] students=new String[n];
		for(int i=0;i<n;i++) {
			ns = sca.nextLine();
		}
		
		
		/*String student="Nandlal Anand Samiran Lovely Rahul";
		String[] students= student.split(" ");*/
		//String[] students= {"Nandlal","Anand","Samiran","Lovely","Rahul"};
		String temp;
		//int n= students.length;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(students[i].compareTo(students[j])>0) {
					temp=students[i];
					students[i]=students[j];
					students[j]=temp;
				}
			
			}
		}System.out.println(Arrays.toString(students));
	}
	}
