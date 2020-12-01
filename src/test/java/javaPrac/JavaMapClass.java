package javaPrac;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class JavaMapClass {

	public static void main(String[] args) {
		
		Map<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(1, "Nandlal");
		hm.put(2, "Sat");
		hm.put(3, "Hari");
		
	/*	Set set = hm.entrySet();
		
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}*/
		
		for(Map.Entry<Integer,String> m : hm.entrySet() ) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
