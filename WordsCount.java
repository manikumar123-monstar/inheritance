package ArraysExamples;

public class WordsCount {

	public static void main(String[] args) {
	String word="Hello Good Morning, How are you?";
	int count=1;
			
	for(int i=0;i<word.length();i++) {
		//count++;
		if(word.charAt(i)==' ') {
			count++;
	}
	}
		System.out.println(count+"count");
	
String str="HII MANI . HOW ARE YOU mani ";
String str1[]=str.split(" ");
int count1=0;
for(int j=0;j<str1.length;j++) {
	count1++;//System.out.println(count1+"count of word");
	
}
System.out.println(count1+"count of word");	

}}
