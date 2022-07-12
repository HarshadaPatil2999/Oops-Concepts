package demo2;

public class PersonMain {
	public static void main(String[] args) {
		
	
Student s=new  Student();
s.setPersonData("Raj","8976543905", "B.E");
s.setStudentData(101,75, "Elect");
s.display();
s.gread();

System.out.println();

Employee e=new Employee();
e.setPersonData("Priya", "9880789067", "Pune");
e.setEmployeeData(102, 35000, "IT");	
e.display();
e.Pf();
}
}