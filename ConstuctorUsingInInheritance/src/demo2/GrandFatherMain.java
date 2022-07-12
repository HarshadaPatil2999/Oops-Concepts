package demo2;
import java.util.Scanner;
public class GrandFatherMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Son s=new Son();
		System.out.println("Enter Grandfather name,middel name,last name ");
		String firstname=sc.next();
		String middlename=sc.next();
		String lastname=sc.next();
		s.setGrandFatherData(firstname, middlename, lastname);
		
		System.out.println("Enter:Father name");
		 firstname=sc.next();
		s.setFatherData(firstname);
		System.out.println("Enter:Son name");
		 firstname=sc.next();
		s.setSonData(firstname);
		
		s.display();
		
//		Son s=new Son();
//		s.setGrandFatherData("Rajkumar","Appasaheb" , "Patil");
//		s.setFatherData("Ramesh");
//		s.setSonData("Raj");
//		s.display();
	}

}
