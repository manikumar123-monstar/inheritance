package mani;

public class Parameterized { 
	int age;
	String name;
	 Parameterized(){
		 name="jay";
		  age=19;
	 }
	
	
	
	
	 
	
	
	 Parameterized(int age1,String name1){
		 
 age=age1;

		 
	
		name=name1;
		 
	 }
	public static void main(String args[]) {
		 Parameterized p=new  Parameterized(20,"mani");
		 Parameterized p1=new  Parameterized();
			
		 System.out.println(p.age);
		 System.out.println(p.name);
		 System.out.println(p1.age);
		 System.out.println(p1.name);
		 
	}

}
