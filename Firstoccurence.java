package ArraysExamples;

import java.util.ArrayList;
import java.util.Arrays;

public class Firstoccurence {
	
	  
	public static void main(String[] args) {
		String name="manikumar sindhe";
		int count=0;

		for(int i=0;i<name.length();i++){
		for(int j=0;j<name.length();j++){
		if(name.charAt(i)==name.charAt(j)){
		System.out.println("first index of"+name.charAt(i)+""+name.indexOf(name.charAt(i)));
		System.out.println(count);
		//break;
		count++;
		}
		}
		}
		
		
		  
	  
	}
}