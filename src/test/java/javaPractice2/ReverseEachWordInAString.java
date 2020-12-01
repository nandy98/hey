package javaPractice2;

public class ReverseEachWordInAString {

	public static void main(String[] args) {
	String s="Nandlal kumar yadav";
	String revWord = "";
	
	String[] s1 = s.split(" ");
	
	for(String word:s1) {
		String revLetter=" ";
	for(int i=word.length()-1;i>=0;i--) {
		revLetter=revLetter+word.charAt(i);
	}
	revWord=revWord + revLetter;
	}
	System.out.println(revWord);
	
	}
}
