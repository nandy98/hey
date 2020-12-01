package javaPractice2;

public class RemoveWhiteSpace {

	public static void main(String[] args) {

		String s = "   @   @   @Nandlal@@@    ";
		String s1 = s.replaceAll("\\s", "");

		System.out.println(s1);

	}

}
