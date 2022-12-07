/**
 * 
 */
package mani;

/**
 * @author sindhe siva
 *
 */
public class laptop {
	String name;
	int size;
	int generation;
	
	laptop(String n,int s,int g){
		name=n;
		size=s;
		generation=g;
	}
	void display() {
		System.out.println(name+" "+size+" "+generation);
		System.out.println("laptop is used to transporation essilly");
		
	}
	

	/**
	 * @param args
	 */public static void main(String args[]) {
		 laptop c=new laptop("dell",15,11);
		 c.display();
	 }

	
		// TODO Auto-generated method stub

	}
