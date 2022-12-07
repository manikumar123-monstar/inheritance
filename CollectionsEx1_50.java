package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsEx1_50 {
	void hello() {
		int n=50;
		ArrayList al=new ArrayList(n);
		

		for(int i=1;i<=n;i++) {
			
			//System.out.println(i);
		
			
			al.add(i);
			
		
		}
		
		System.out.println(al);
		
		
	}

	public static void main(String[] args) {
		
		CollectionsEx1_50 c=new CollectionsEx1_50();
		c.hello();
			
		}

	}


