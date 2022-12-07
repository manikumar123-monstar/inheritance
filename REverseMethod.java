package ArraysExamples;

public class REverseMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int  str=1234567,revesenumber=0,reminder=0;
		/*while(str>0) {
		reminder=str%10;
		revesenumber=revesenumber*10+reminder;
		str=str/10;
		
		
		}
		System.out.println(revesenumber);*/
		 //another method/
		String  str="1234567";
		StringBuffer sbr=new StringBuffer(str);
		System.out.println(sbr);
		sbr.reverse();
		System.out.println(sbr);
		// it is printing patterns order//
		for(int i=0;i<sbr.capacity();i++) {
			for(int j=i;j>0;j--) {
			System.out.print(sbr);
			
		}
			System.out.println();
		}
		
			}
		

	}


