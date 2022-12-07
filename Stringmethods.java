 package StringsExamples;

public class Stringmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";//String pool
		String s1=new String("hello");//heap
        String s2="   SAiprai  SaDmani  ";
       String s3="   ";
       String s12="";
       //String[] s5="/","23","06","2000";
       String s4=new String("Hello");
     System.out.println(s==s3);
     System.out.println(s1.equals(s4));
     System.out.println(s+s2);
     System.out.println(s.equalsIgnoreCase(s2));
     System.out.println(s.contains("l"));
     System.out.println(s2.startsWith("s"));
     System.out.println(s2.endsWith("i"));
     System.out.println(s2.length());
     System.out.println(s3.trim());
     System.out.println(s2.toLowerCase());
     System.out.println(s2.toUpperCase());
   System.out.println(s2.indexOf("i"));
   System.out.println(s2.lastIndexOf("i"));
   System.out.println(s2.substring(4, 8));
   System.out.println(s2.subSequence(3, 5));
   System.out.println(s2.split("p"));
   System.out.println(s2.charAt(5));
   System.out.println(s2.replace("i", "A"));
   System.out.println(s2.replaceAll(s4, s2));
  System.out.println(s2.isEmpty());
  System.out.println(s2.isBlank());
  System.out.println(s2.replace(" ", ""));
 System.out.println(s1.compareTo(s4));
 System.out.println(s1.compareToIgnoreCase(s4));
 System.out.println(s4.join(s4,s3,s));
  System.out.println(s12.join("/","21","07","2000"));
  
	}

}
	