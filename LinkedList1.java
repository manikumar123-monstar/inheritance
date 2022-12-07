package LinkedList;

import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add("mani");
		ll.add("pushu");
		ll.add("jay");
		ll.add("vani");
		ll.add("ganesh");
		System.out.println(ll);
		Collections.sort(ll);
		System.out.println(ll);
		ll.add(2, 2);
		System.out.println(ll);
		Date d=new Date(12);
		
		System.out.println(d);
		d.after(d);
		System.out.println(d);
		LinkedList l2=new LinkedList();
		l2.add(100);
		for(int i=0;i<l2.size();i++) {
			System.out.print(i);
		}
		
		/*l2.add(1);
		l2.add(1);
		l2.add(1);
		l2.add(1);
		l2.add(1);
		l2.add(1);
		l2.add(1);
		l2.add(1);
		l2.add(1);
		l2.add(1);
		l2.add(1);
		l2.add(1);*/

		
	}

}
