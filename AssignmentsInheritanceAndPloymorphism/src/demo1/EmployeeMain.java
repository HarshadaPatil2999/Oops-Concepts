package demo1;
import java.util.Arrays;
import java.util.Scanner;
public class EmployeeMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Employee e[]=new Employee[2];
		for(int i=0;i<2;i++)
		{
			System.out.println("Enter:Employee id,Employee name,Salary,Dept Details,Mydate Details");
			int id=sc.nextInt(); String name=sc.next(); int salary=sc.nextInt();
			 Department d[]=new Department[1];
			 for(int j=0;j<1;j++)
              {
				 System.out.println("Enter:Dept id,Dept name");
				 int dept_id=sc.nextInt();
				 String dept_name=sc.next();
				 
				 Department d1=new Department();
				 d1.setDept_id(dept_id); d1.setDept_name(dept_name);
				 d[j]=d1;
				 
			  }
			 Mydate m[]=new Mydate[1];
			 for(int k=0;k<1;k++)
			 {
				 System.out.println("Enter:day,month,year");
				 int day=sc.nextInt(); int month=sc.nextInt(); int year=sc.nextInt();
				 
				 Mydate m1=new Mydate();
				 m1.setDay(day); m1.setMonth(month); m1.setYear(year);
				 m[k]=m1;
				 
			 }
			 Employee e1=new Employee();
			 e1.setId(id); e1.setName(name); e1.setSalary(salary); e1.setDept(d); e1.setM(m);
			e[i]=e1;
			
			
			
		} System.out.println(Arrays.toString(e));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * System.out.
		 * println("Enter:Employee id,Employee name,Salary,Dept Details,Mydate Details"
		 * ); int id=sc.nextInt(); String name=sc.next(); int salary=sc.nextInt();
		 * System.out.println("Enter:Dept id,Dept name"); int dept_id=sc.nextInt();
		 * String dept_name=sc.next(); System.out.println("Enter:day,month,year"); int
		 * day=sc.nextInt(); int month=sc.nextInt(); int year=sc.nextInt();
		 * 
		 * Mydate m1=new Mydate();
		 * 
		 * m1.setDay(day); m1.setMonth(month); m1.setYear(year);
		 * 
		 * Department d=new Department();
		 * 
		 * d.setDept_id(dept_id); d.setDept_name(dept_name);
		 * 
		 * Employee e=new Employee();
		 * 
		 * e.setId(id); e.setName(name); e.setSalary(salary); e.setDept(d); e.setM(m1);
		 * System.out.println(e);
		 */
		
		
		
	}

}
