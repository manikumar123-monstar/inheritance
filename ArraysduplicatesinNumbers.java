package ArraysExamples;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysduplicatesinNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr[]= {"mani","jay","mani","ajay","sai","pavan","sai","prudvi","sai"};
		ArrayList al=new ArrayList(Arrays.asList(arr));
		System.out.println(al);
		ArrayList al2=new ArrayList();
		
		for(String element:arr) {
			if(!al2.contains(element))
			//if(!al.contains(element))
				
				al2.add(element);
		}
		
		System.out.println(al2);
	}

	}

