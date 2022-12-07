package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionEx1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		  al.add("mani");
		  al.add("pavan");
		  al.add("ajay");
		  al.add("JAY");
		  al.add("jesus");
		  System.out.println(al);
		//  System.out.println(al.addAll(al));
		  ArrayList a2=new ArrayList(al);
		  System.out.println(al);
		  a2.remove("ajay");
		  System.out.println(a2);
		 Collections.sort(al); 
	  System.out.println(al);
	  Collections.reverse(a2);
	  System.out.println(a2);
		  a2.add(1, "JAy");
		  System.out.println(a2);
    	  // a2.addAll(2, a2);
    	   //System.out.println(a2);
		  a2.clear();
		  System.out.println(a2);
		  al.clone();
		  System.out.println(al);
		  Collections.reverse(a2);
		  System.out.println(a2);
		  
       }
	}


