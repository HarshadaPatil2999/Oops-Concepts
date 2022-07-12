package demo;

public class Daughter extends Father {
	String vehicle;
	void setDaugtherData(String vehicle)
	{
		this.vehicle=vehicle;
	}
	public String toString()
	{
		return name+" "+surname+" "+age+" "+vehicle;
	}

}
