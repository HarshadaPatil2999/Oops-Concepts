package assignmentq1;
import java.util.Scanner;
public class StudentDeptmain {
	public static void main(String[] args) {
		int id;
		String dname;
		int roll_no;
		String name;
		Department d;
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter roll_no,name,id,dname");
		roll_no=sc.nextInt();
		name=sc.next();
		id=sc.nextInt();
		dname=sc.next();
		
		Department d1=new Department();
		d1.setId(id);
		d1.setDname(dname);
		
		Student s1=new Student();
	    s1.setRoll_no(roll_no);
		s1.setName(dname);
        s1.setD(d1);
		System.out.println(s1);
	}

}
