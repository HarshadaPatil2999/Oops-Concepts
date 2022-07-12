package Demo;

import java.util.Scanner;


public class Employeemain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int emp_id,salary;
		String name;
		Employee3 e1=new Employee3();
		System.out.println("Enter emp_id,name,salary");
		emp_id=sc.nextInt();
		name=sc.next();
		salary=sc.nextInt();
		e1.setEmp_id(emp_id);
		e1.setName(name);
		e1.setSalary(salary);
		System.out.println(e1);
		System.out.println();
		e1.getName();
		e1.setName("radha");
		System.out.println(e1);
	}

}
