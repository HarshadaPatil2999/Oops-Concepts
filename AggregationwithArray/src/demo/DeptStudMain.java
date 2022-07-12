package demo;

import java.util.Arrays;
import java.util.Scanner;



public class DeptStudMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Department dept[]=new Department[5];
		
	for(int i=0;i<2;i++)
{
		System.out.println("Enter did,dname,student list:of the department");
		int did=sc.nextInt();
		String dname=sc.next();
	
	  Student stud[]=new Student[3];
	    for(int j=0;j<2;j++)
	{
		System.out.println("Enter id,name,marks,contact of the"+(j+1)+" student:");
		int id=sc.nextInt();
		String name=sc.next();
		int marks=sc.nextInt();
		String contact=sc.next();
		
		Student s1=new Student();
		s1.setId(id);
		s1.setName(name);
		s1.setMarks(marks);
		s1.setContact(contact);
		stud[j]=s1;
		
		
	   
		
	}
	
	    Department d1 =new Department();
	    d1.setDid(did);
	    d1.setDname(dname);
	    d1.setStud(stud);
	    dept[i]=d1;
	       
}
	System.out.println(Arrays.toString(dept));
	for(Department d:dept)
	{
		for(Student s:d.stud)
		{
			if(s.getMarks()>60)
			{
				System.out.println(d.dname+" "+s.name+" "+s.marks);
			}
		}
		
		
		
		
		
	}
	
		
	}
	}


