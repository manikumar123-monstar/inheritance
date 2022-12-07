package StringsExamples;

import java.util.Collections;

public class StringBuilderEx {
	public void display() {
		StringBuilder sb=new StringBuilder("maniKumar");
		sb.reverse()	;
		
		System.out.println(sb);
	}
	public void hello() {
		display();
	}

	public static void main(String[] args) {
		StringBuilderEx a=new StringBuilderEx();
		a.display();
		a.hello();
		
	}

}