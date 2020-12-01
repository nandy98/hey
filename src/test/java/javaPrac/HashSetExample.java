package javaPrac;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> hs=new HashSet<String>();

		hs.add("Vijay");
		hs.add("ajay");
		hs.add("Sat");
		hs.add("Kritika");
		hs.remove("Vijay");
		//System.out.println(hs);
		
		Iterator<String> it = hs.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
	}

}
