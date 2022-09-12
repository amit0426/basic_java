package Basics_of_collections;

import java.util.Hashtable;
import java.util.Vector;

public class CollectionDemo {
	
	public static void main(String[] args) {
		
		
		int arr[] = new int[] {
				1,2,3,4,5
				
		};
		
		
		Vector<Integer> vect = new Vector<>();
		Hashtable<Integer, String> h = new Hashtable<>();
		
		vect.addElement(1);
		vect.addElement(2);
		
		h.put(1, "amit");
		h.put(2, "1amit");
		
		System.out.println(arr[0]);
		System.out.println(vect.elementAt(0));
		System.out.println(h.get(1));
		
//		1
//		1
//		amit
		
	}

}
