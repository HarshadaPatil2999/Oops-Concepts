package demo;
import java.util.Scanner;
public class Student1 {
	static String collagename="ABC";
int id,marks;
String name,dept;

Student1(int id,String name,String dept,int marks)
{
	this.id=id;
	this.name=name;
	this.dept=dept;
	this.marks=marks;
}
//static
//{
//	System.out.println("collage name:"+collagename);
//}
static void collagename1()
{
	System.out.println("collage name:"+collagename);
}
public String toString()
{
	return id+" "+name+" "+dept+" "+marks;
}

public static void main(String[] args) {
	
	int id,marks;
	String name,dept;
   Scanner sc=new Scanner(System.in);
     Student1.collagename1();
   
   System.out.println("Enter:id,name,dept,marks");
	id=sc.nextInt();
    name=sc.next();
    dept=sc.next();
	marks=sc.nextInt();
	Student1 s1=new Student1(id,name,dept,marks);
      System.out.println(s1);
      
      System.out.println("Enter:id,name,dept,marks");
       id=sc.nextInt();
      name=sc.next();
      dept=sc.next();
  	  marks=sc.nextInt();
	Student1 s2=new Student1(id,name,dept,marks);
	System.out.println(s2);
}
}