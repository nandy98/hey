package javaPractice2;

public class CountVowel {

	public static void main(String[] args) {
		String s="nandlal kumar yadav";
		int vowel=0;
		//1,Logic
		String s1 = s.replaceAll("[a,e,i,o,u]", "");
		
		System.out.println(s.length()-s1.length());
		
		//2.Logic
		/*for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
			++vowel;	
			}
		}System.out.println(vowel);*/
	}

}
