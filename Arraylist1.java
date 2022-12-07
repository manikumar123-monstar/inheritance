package ArraysExamples;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist1 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add('v');
		al.add('M');
		al.add('c');
		al.add('a');
		al.add('A');
		al.add('b');
		//System.out.println(al);
		//Collections.sort(al);
		//System.out.println(al);
		//al.remove(1);
		//System.out.println(al);
		al.removeAll(al);
		System.out.println(al);
		


	}

}
