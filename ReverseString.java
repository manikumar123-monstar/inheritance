package ArraysExamples;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//by using String Builder
		String str="ManiKumar";
		StringBuilder b=new StringBuilder (str);
		b.reverse();
		System.out.println(b);
		
		
		
		
		/*String str="ManiKumar";
		
		for(int j=str.length();j>0;--j)//
		
		{
		System.out.print(str.charAt(j-1)); 
		}
		//BY USING sTRING BUFFER METHOD//
		/*StringBuffer sb=new StringBuffer (str);
		sb.reverse();
		System.out.println(sb);*/
			}
			
		
		

	}


