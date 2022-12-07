package LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class Example1 {

	public static void main(String[] args) {
		String s[]= {"mani"};
		
		LinkedList ll=new LinkedList(Arrays.asList(s));
		System.out.println(ll);
		ll.add("MAni");
		ll.add("MAni");
		ll.add("MAni");
		ll.add("MAni");
		ll.add("MAni");
		System.out.println(ll);
		for (Object object : ll) {
			System.out.println(object);
			
		}
			
		}
		//	System.out.println(i);
			
		

	}


