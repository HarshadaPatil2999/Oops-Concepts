package demo;
import java.util.Scanner;
public class Example {
	static String collagename="XYZ";
	int id,marks;
	String name,dept;
	static 
	{
		System.out.println("ABC");
	}
	static
	{
		System.out.println("DYP");
	}static
	{
		System.out.println("collage name:"+collagename);
	}
	{
		id=1;
		name="neha";
		marks=85;
		dept="elect";
		System.out.println("instance block");
		
	}
	
	Example(int id,String name,String dept,int marks)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.marks=marks;
	}
	
	public String toString()
	{
		return id+" "+name+" "+dept+" "+marks;
	}
	public static void main(String[] args) {
		
		int id,marks;
		String name,dept;
	   Scanner sc=new Scanner(System.in);
	    System.out.println("Enter:id,name,dept,marks");
	id=sc.nextInt();
    name=sc.next();
	    dept=sc.next();
		marks=sc.nextInt();
        Example e1=new Example(id,name,dept,marks);
		System.out.println(e1);
		
		
		
	}
}
