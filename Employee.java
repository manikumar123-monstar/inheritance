package mani;

public class Employee {
	String em_name;
	String emp_roll;
	int emp_id;
	int emp_salary;
	

	public static void main(String[] args) {
		

	}


	public String getEm_name() {
		return em_name;
	}


	public void setEm_name(String em_name) {
		this.em_name = em_name;
	}


	public String getEmp_roll() {
		return emp_roll;
	}


	public void setEmp_roll(String emp_roll) {
		this.emp_roll = emp_roll;
	}


	public int getEmp_id() {
		return emp_id;
	}


	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}


	@Override
	public String toString() {
		return "Employee [em_name=" + em_name + ", emp_roll=" + emp_roll + ", emp_id=" + emp_id + ", emp_salary="
				+ emp_salary + "]";
	}


	public int getEmp_salary() {
		return emp_salary;
	}


	public void setEmp_salary(int emp_salary) {
		this.emp_salary = emp_salary;
	}

}
