package ArraysExamples;

public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {12,23,5,15,34,85,75};
		int n=a.length;
		System.out.println(a.length);
		System.out.println(a[0]);
		int i,j,t=0;
		for( i=0;i<n;i++) {
			System.out.println("before sorting "+a[i]);
			
		}
		for( i=0;i<n;i++) {
		for( j=1+i;j<n;j++) {
			if(a[j]>a[i]) {
				t=a[i];
				a[i]=a[j];
				a[j]=t;
				
				
			}
			
		}
		
	}
		System.out.println();
		for( i=0;i<n;i++) {
			System.out.println("after sorting "+a[i]);
			

	}
}}
