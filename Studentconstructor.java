package mani;

public class Studentconstructor {
	String name;
	int roll_no;
	 Studentconstructor(){
		name="mani";
		 roll_no=7;
	} 
	
	Studentconstructor( String cname,int rol){
		name=cname;
		roll_no=rol;
		
	}

	public static void main(String[] args) {
		Studentconstructor s1=new Studentconstructor();
		Studentconstructor s2=new Studentconstructor("pavan",87);
		System.out.println(s1.name);
		System.out.println(s1.roll_no);
		System.out.println(s2.name);
		System.out.println(s2.roll_no);
		// TODO Auto-generated method stub

	}

}
