
package Collections;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class CollectionsDuplicate {

public static void main(String[]arg) {
	String []a={"Pavan","Mani","sai","ajay","Mani"};
	List<String> al = Arrays.asList(a);
	System.out.println(al);
	al.remove("Mani");
	System.out.println(al);
	
}
}
