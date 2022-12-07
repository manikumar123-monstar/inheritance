package ArraysExamples;

public class CountofArray {

	public static void main(String[] args) {
	char []a= {'m','a','n','i','k','u','m','a','r','s'};
	char []b= {'n'};
	int count=0;
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<b.length;j++) {
			if(a[i]==b[j]) {
			count++;	
			}
		}
		
		
	}
	System.out.println(count);	
		
		
		
		
		
	}
}
