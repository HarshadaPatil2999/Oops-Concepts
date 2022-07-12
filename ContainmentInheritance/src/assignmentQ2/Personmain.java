package assignmentQ2;
import java.util.Scanner;
public class Personmain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age;
		String name,gender;
		Address a;
		String city,state,country;
	
	System.out.println("Enter  name,gender,age, city,state,country");
	name=sc.next();
	gender=sc.next();
	age=sc.nextInt();
	city=sc.next();
	state=sc.next();
	country=sc.next();
	Address a1=new Address();
	a1.setCity(city);
	a1.setState(state);
	a1.setCountry(country);
	
	
	Person p1=new Person();
	p1.setName(name);
	p1.setGender(gender);
	p1.setAge(age);
	p1.setA(a1);
   System.out.println(p1);

}
}