package demo1;

import java.util.Arrays;

public class Employee {
	int id,salary;
	String name;
	Department dept[];
	Mydate m[];
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Department[] getDept() {
		return dept;
	}

	public void setDept(Department dept[]) {
		this.dept = dept;
	}

	public Mydate[] getM() {
		return m;
	}

	public void setM(Mydate m[]) {
		this.m = m;
	}
	
	public String toString() {
		return id+" "+name+" "+salary+" "+Arrays.toString(dept)+" "+Arrays.toString(m); 
	}
	
	
	

	/*
	 * public String toString() { return id+" "+name+" "+dept+" "+salary+" "+m; }
	 */
}
