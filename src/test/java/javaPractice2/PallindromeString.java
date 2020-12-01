package javaPractice2;

public class PallindromeString {

	public static void main(String[] args) {

		String name="abcba";

		String dname=name;

		String rev="";

		int n = dname.length()-1;
		for(int i=n;i>=0;i--){
		rev =rev+dname.charAt(i);
		}
		if(dname.equals(rev)){
		System.out.println("Pallindrome Name");
		}

		else{
		System.out.println("Not Pallindrome");
		}

	}

}
