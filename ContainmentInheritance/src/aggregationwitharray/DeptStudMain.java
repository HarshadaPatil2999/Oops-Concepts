package aggregationwitharray;
import java.util.Arrays;
import java.util.Scanner;
public class DeptStudMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Department dept[]=new Department[3];
		
	for(int i=0;i<3;i++)
{
		System.out.println("Enter did,dname,student list:of the department");
		int did=sc.nextInt();
		String dname=sc.next();
	
	  Student stud[]=new Student[3];
	    for(int j=0;j<3;j++)
	{
		System.out.println("Enter id,name,marks,contact of the"+(j+1)+" student:");
		int id=sc.nextInt();
		String name=sc.next();
		int marks=sc.nextInt();
		String contact=sc.next();
		
		stud[j]=new Student(id,name,marks,contact);
	   
		
	}
	
	      dept[i]=new Department(did,dname,stud);
	       
}
	System.out.println(Arrays.toString(dept));
	for(Department d:dept)
	{
		for(Student s:d.stud)
		{
			if(s.marks>60)
			{
				System.out.println(d.dname+" "+s.name+" "+s.marks);
			}
		}
		
		
		
		
		
	}
	
		
	}
}
