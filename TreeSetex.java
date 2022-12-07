package LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class TreeSetex {

	public static void main(String[] args) {
		int[] a= {1,5,8,5,9,0,34,2,13,4,6,7};
		//Arrays.asList(a);
		ArrayList <Integer>al=new ArrayList<Integer>(a.length);
		System.out.println(al);
		for (int i : a) {
			al.add(i);
			
		}
		System.out.println(al);
		
	TreeSet tr=new TreeSet(al);
		System.out.println(tr);

	}

}
