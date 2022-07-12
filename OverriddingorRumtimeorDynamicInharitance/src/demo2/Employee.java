package demo2;

public class Employee extends Person {
	int id,salary;
	String dept;
	void setEmployeeData(int id,int salary,String dept)
	{
		this.id=id;
		this.salary=salary;
		this.dept=dept;
	}
	void Pf()
	{
		float pf=(salary*15)/100;
		System.out.println("Pf will be"+pf);
	}
	void display()
	{super.display();
		System.out.println(id+" "+salary+" "+dept );
	}

}
