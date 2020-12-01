package javaPrac;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
	
	public static void main(String[] args) {
		ArrayList list =new ArrayList();
		list.add(10);
		list.add(0, 5);
		list.add(15);
		list.add(20);
		list.add(15);
		
		System.out.println(list);
		
		Iterator it = list.iterator();
		
		list.size();
		for(int i=0;i<list.size();i++){
			for(int j=0;j<list.size();j++) {
				if(list.get(i)==list.get(j)) {
					System.out.println(list.get(i));
				}
			}
		}
	}

}
