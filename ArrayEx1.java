package ArraysExamples;
public class ArrayEx1 {

		public static void main(String[] args) {
		 int [] a ={3,6,8,1,5,9,2};
		 int temp=0;
		 for(int i=0;i<a.length;i++) {
			 for(int j=i+1;j<a.length;j++) {
				 if(a[i]<a[j]) {
					 temp=a[i];
					 a[i]=a[j];
					 a[j]=temp;
	}}
	System.out.println(a[i]+"");
	 }
		}
	}
