package ArraysExamples;

public class ArraylistCount {

	public static void main(String[] args) {
		String str="mani kumar sindhe siva";
		int count=0;
		for(int i=0;i<str.length();i++) {
			count=0;
			for(int j=0;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
								count++;
				}}
				if(count>1)
			
			System.out.println(str.charAt(i)+"  count "+count);
		}

	}

}
