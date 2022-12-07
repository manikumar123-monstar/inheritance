package Exception;

public class Exception_Ex {
	

	public static void main(String[] args) {
		int n =9;
		int m= 0;
		int result=0;
		try {
		 result=n%m;	
		}
			catch(ArithmeticException ae) {
				
			
		
		System.out.println(ae.toString());
			}
		finally {
			
		
		
			System.out.println("i am finally block");
		}
		
		
	}}


