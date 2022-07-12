package demo2;

public class Student extends Person {
	int id;
	float percentage;
	String dept;
	void setStudentData(int id,float percentage,String dept)
	{
		this.id=id;
		this.percentage=percentage;
		this.dept=dept;
	}
	void gread()
	{
		if(percentage>=75)
		{
			System.out.println(" A gread");
			
		}
		else if(percentage>=60)
		{
			System.out.println(" B gread");
			
		}
		else if(percentage>=50)
		{
			System.out.println(" C gread");
			
		}
		else if(percentage>=40)
		{
			System.out.println(" D gread");
			
		}
		else
			System.out.println("fail....");
	}
	void display()
	{super.display();
		System.out.println(id+" "+percentage+" "+dept);
	}

}
