/**
 * 
 */
package mani;

/**
 * @author sindhe siva
 *
 */
public class student {
	int id;
	String name;
	int age;
	int a=10,b=20,
	c=a+b;
	student(int i,String n){
		id=i;
		name=n;}
	student(int i,String n,int a){
		id=i;
		name=n;
		age=a;
	System.out.println("result="+c);
	}
	
		void display() {
			System.out.println(id+""+name);
			System.out.println(id+""+name+""+age);
			
		}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("hello");
		student s1=new student(101,"mani");
		student s2=new student(121,"pavan",23);
		s1.display();
		s2.display();
		// TODO Auto-generated method stub

	}

}
