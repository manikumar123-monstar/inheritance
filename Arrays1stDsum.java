package ArraysExamples;

public class Arrays1stDsum {
	 void small() {
		int a[]=new int[7];
		a[0]=1;
		a[1]=7;
		a[0]=32;
		a[3]=6;
		a[5]=0;
		a[6]=9;
		
		
		System.out.println(a.length);
		
		int b=a[0]+a[1]+a[2]+a[3]+a[4]+a[5]+a[6];
		System.out.println("sum :"+b);
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrays1stDsum a=new Arrays1stDsum();
		a.small();
		
		
		}
	}


