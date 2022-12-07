package ArraysExamples;

public class PrimenumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,3,4,5,6,7,8};
		int n=a.length;
		for(int i=0;i<n;i++) {
			int count=0;
			for(int j=1;j<=n;j++) {
			if(a[i]%j==0) {
				count++;
			}}
				if(count==2) {
					System.out.println(a[i]);
			}
			
		}

	}
	}

