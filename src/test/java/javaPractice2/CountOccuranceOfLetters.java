package javaPractice2;

public class CountOccuranceOfLetters {

	public static void main(String[] args) {
		
		String s="Nandlal kumar yadav";
		
		String s2 = s.replaceAll("a", "");
		
		System.out.println(s.length()-s2.length());
	}

}
