package writtenTestQ1c;
import java.util.Scanner;
public class PersonMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student s=new Student();
		System.out.println("Enter:name,age,dept,marks");
		String name=sc.next();
		int age=sc.nextInt();
		String dept=sc.next();
		
		int marks=sc.nextInt();
		s.setName(name);
		s.setAge(age);
		s.setDept(dept);
		s.setMarks(marks);
		System.out.println(s);
		s.collagename();
				
	}

}
