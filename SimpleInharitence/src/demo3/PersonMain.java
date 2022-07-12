package demo3;
import java.util.Scanner;
public class PersonMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Facualty f1=new Facualty();
		
		System.out.println("Enter:id,name,subject,performance,salary,contact,address,gender");
		
		int id=sc.nextInt();
		String name=sc.next();
		String subject=sc.next();
		char performance=sc.next().charAt(0);
		int salary=sc.nextInt();
		 String contact=sc.next();
		String address=sc.next();
		String gender=sc.next();
		f1.setPersonData(name, contact, address, gender);
		f1.setFacultyData(id, subject, salary, performance);
		System.out.println(f1);
		f1.bonus();
		System.out.println();
		
		
		
	}

}
