package Exception;

import java.util.ArrayList;
import java.util.Collections;

public class Fall {

	public static void main(String[] args) {
		Comparable1 a=new Comparable1 ("dell", 8, 10, 34000);
		Comparable1 a2=new Comparable1 ("hp", 16, 11, 32000);
		Comparable1 a1=new Comparable1 ("Apple", 32, 13, 56000);
       
		ArrayList<Comparable1> al=new ArrayList <Comparable1> ();
		al.add(a1);
		al.add(a2);
		al.add(a);
		Collections.sort(al);
		System.out.println(al);
		
	}

}
