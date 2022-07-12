package demo2;

public class GrandFather {
	String firstname,middlename,lastname;
	
	void setGrandFatherData(String firstname,String middlename,String lastname)
	{
		this.firstname=firstname;
		this.middlename=middlename;
		this.lastname=lastname;
	}
	void display()
	{
		System.out.println( firstname+" "+middlename+" "+lastname );
	}

}
