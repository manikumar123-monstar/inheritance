package LinkedList;

import java.util.HashSet;
import java.util.LinkedList;

public class HashSetExaple {

	public static void main(String[] args) {
		
		LinkedList ll=new LinkedList();
		ll.add("Mani");
		ll.add("Sai");
		ll.add("ajay");
		ll.add("pavan");
		ll.add("siva");
		ll.add("Mani");
		ll.add("Sai");
		
	
		HashSet hs=new HashSet(ll);
		System.out.println(hs);

	}

}
