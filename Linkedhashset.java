package LinkedList;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Linkedhashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet hs=new LinkedHashSet();
		hs.add("sai");
		hs.add("mani");
		hs.add("Sai");
		hs.add("sIva");
		hs.add("pAvan");
		hs.add("Ajay");
		System.out.println(hs);
		
		TreeSet ts =new TreeSet();
		ts.addAll(hs);
		System.out.println(ts);
		

	}

}
