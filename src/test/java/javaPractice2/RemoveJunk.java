package javaPractice2;

public class RemoveJunk {

	public static void main(String[] args) {

		String s = "@@@Nandlal@@@";
		String s1 = s.replaceAll("[^a-zA-Z0-9]", "");

		System.out.println(s1);

	}

}
