package aggregationContainment;

public class Driver {
	int id;
	String name,contact;
	Driver(int id,String name,String contact)
	{
		this.id=id;
		this.name=name;
		this.contact=contact;
	}
	public String toString()
	{
		return name+" "+contact;
	}

}
