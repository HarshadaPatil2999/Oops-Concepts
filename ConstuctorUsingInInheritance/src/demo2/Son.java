package demo2;

public class Son extends Father {
	String firstname;
	void setSonData(String firstname)
	{
		this.firstname=firstname;
	}
void display()
{  super.display();
	System.out.println(firstname+" "+super.firstname+" "+lastname);
}
}
