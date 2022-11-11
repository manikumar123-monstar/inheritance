package ArraysExamples;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayAscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a ={3,6,8,1,5,9,2};
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				//if(a[i]>a[j]) {//Ascending order
					if(a[j]>a[i]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;

}}

System.out.println(a[i]);
		
		}
		
		
	}

}
