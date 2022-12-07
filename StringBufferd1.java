package StringsExamples;

public class StringBufferd1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer strb=new StringBuffer("hiiwelcome");
		System.out.println(strb.append("hlo"));
		System.out.println(strb.capacity());
		System.out.println(strb.delete(2, 4));
		System.out.println(strb.reverse());
		System.out.println(strb.replace(2, 4, "mani"));
		System.out.println(strb.insert(3, "cool"));
		StringBuffer str1b=new StringBuffer();
		StringBuilder sb=new StringBuilder();
		
		String s1="mani kumar";
		StringBuffer str=new StringBuffer(s1);
		str.reverse();
		System.out.println(str);
	
		
	

	}

}
