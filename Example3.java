package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Spliterator;

public class Example3 {

	public static void main(String[] args) {
		String []s= {"mani,sai,ajay,pavan,sai,siva"};
		List l=new ArrayList(Arrays.asList(s));
		Spliterator w=l.spliterator();
		//System.out.println(l);
		for (Object obj : l) {
			
		
		System.out.println(obj);
		}

	}

}
