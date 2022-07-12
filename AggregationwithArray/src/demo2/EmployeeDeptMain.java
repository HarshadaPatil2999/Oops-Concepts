package demo2;
import java.util.Arrays;
import java.util.Scanner;
public class EmployeeDeptMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Department dept[]=new Department[2];
		for(int i=0;i<2;i++)
		{
			System.out.println("Enter"+(i+1)+" dname,total no of employee,Employee Details");
			String dname=sc.next();
			int totalnoemp=sc.nextInt();
			Employee emp[]=new Employee[2];
			for(int j=0;j<2;j++)
			{
				System.out.println("Enter"+(j+1)+"id,name,salary,contact,address");
				int id=sc.nextInt();
				String name=sc.next();
				int salary=sc.nextInt();
				String contact=sc.next();
				String address=sc.next();
				
				Employee e1=new Employee();
				e1.setId(id);
				e1.setName(name);
				e1.setSalary(salary);
				e1.setContact(contact);
				e1.setAddress(address);
				
				
				emp[j]=e1;
			}
			Department d1=new Department();
			d1.setDname(dname);
			d1.setTotalnoemp(totalnoemp);
			d1.setEmp(emp);
			
			dept[i]=d1;
		}
		System.out.println(Arrays.toString(dept));
		for(Department d:dept )
		{
			for(Employee e:d.emp)
			{
				if(e.getSalary()>50000)
				{
					float bonus=(e.getSalary()*15)/100;
					float newSalary=e.getSalary()+bonus;
					System.out.println(d.dname+" "+e.id+" "+e.name+" "+e.salary+" "+e.address+" "+bonus+" "+newSalary);
				}
			}
		}
		
		
		
		
		
//		for(Department d:dept )
//		{
//			for(Employee e:d.emp)
//			{
//				if(e.getAddress().equals("pune") && e.getSalary()>30000)
//				{
//					System.out.println(d.dname+" "+e.id+" "+e.name+" "+e.salary+" "+e.address);
//				}
//			}
//		}
	}

}
