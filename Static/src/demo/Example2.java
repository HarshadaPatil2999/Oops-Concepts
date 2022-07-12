package demo;

public class Example2 {
	static String collagename;
	int id,marks;
	String name,dept;
	
	{
		id=10;
		name="riya";
		dept="elct";
		marks=75;
		collagename="ABC";
		System.out.println("instant block");
	}
	Example2(int id,String name,String dept,int marks)
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
	
	{
	System.out.println("instant block2");
	}
	Example2()
	
	{
//		id=11;
//	name="priya";
//	dept="entc";
//	marks=80;
//		
	System.out.println("default constructor");
	}
	
	public static void main(String[] args) {
		
		Example2 e1=new Example2();
		
		System.out.println(e1);
		
        Example2 e2=new Example2();
		
		System.out.println(e2);
		
		
		
		
	}
}
