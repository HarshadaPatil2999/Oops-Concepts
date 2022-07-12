package Demo;

public class Employee3 {
	private	int emp_id,salary;
	private String name;
	
	Employee3(){}
	
	 public int getEmp_id() {
			return emp_id;
		}

	public void setEmp_id(int emp_id) {
			this.emp_id = emp_id;
		}

	public int getSalary() {
			return salary;
		}

	public void setSalary(int salary) {
			this.salary = salary;
		}

	public String getName() {
			return name;
		}
	public void setName(String name) {
			this.name = name;
		}
	
	
	
	
	
	
//protected int getEmp_id() {
//		return emp_id;
//	}
//protected void setEmp_id(int emp_id) {
//		this.emp_id = emp_id;
//	}
//
//protected int getSalary() {
//		return salary;
//	}
//
//protected void setSalary(int salary) {
//		this.salary = salary;
//	}
//
//protected String getName() {
//		return name;
//	}
//protected void setName(String name) {
//		this.name = name;
//	}






public String toString()
{
	return emp_id+" "+name+" "+salary;
}

}
