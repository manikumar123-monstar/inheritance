package LinkedList;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

import mani.Employee;

public class HAshSetEx2 {

	private static Employee[] Employee;
	private static boolean emp11;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs=new HashSet();
		 Employee emp=new  Employee();
		 emp.setEm_name("Sai sir");
		 emp.setEmp_id(1438);
		 emp.setEmp_roll("devloper");
		 emp.setEmp_salary(100000);
		// HashSet hs=new HashSet();
		// hs.add( emp);
		// System.out.println(hs);
		 Employee emp1=new  Employee();
		 emp1.setEm_name("Sai sir");
		 emp1.setEmp_id(1438);
		 emp1.setEmp_roll("devloper");
		 emp1.setEmp_salary(100000);
		 
		 Employee emp2=new  Employee();
		 emp2.setEm_name("mani kumar");
		 emp2.setEmp_id(142);
		 emp2.setEmp_roll("devloper");
		 emp2.setEmp_salary(200000);
		 Employee emp3=new  Employee();
		 emp3.setEm_name("Siva");
		 emp3.setEmp_id(133);
		 emp3.setEmp_roll("testing");
		 emp3.setEmp_salary(400000);
		 Employee emp4=new  Employee();
		 emp4.setEm_name("pavan");
		 emp4.setEmp_id(333);
		 emp4.setEmp_roll("testing");
		 emp4.setEmp_salary(50000);
		 Employee emp5=new  Employee();
		 emp5.setEm_name("jay");
		 emp5.setEmp_id(448);
		 emp5.setEmp_roll("support");
		 emp5.setEmp_salary(50000);
		 Employee emp6=new  Employee();
		 emp6.setEm_name("ajay");
		 emp6.setEmp_id(111);
		 emp6.setEmp_roll("mangement");
		 emp6.setEmp_salary(45000);
		 
		 
		 HashSet<Employee> hs1=new HashSet<Employee>();
		 hs1.add(emp);
		 hs1.add(emp1);
		 hs1.add(emp2);
		 hs1.add(emp3);                               
		 hs1.add(emp4);
		 hs1.add(emp5);
		 hs1.add(emp6);
		 
		for (Employee employee : hs1) {
		
			if(employee.getEm_name().startsWith("S")) {
				if(employee.getEmp_salary()<500000) {
				System.out.println(employee.getEm_name() + " name "+ employee.getEmp_roll() +" roll");
			}
		}}
			
		}
	}


