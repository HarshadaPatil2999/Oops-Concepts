package demo2;

public class Father extends GrandFather {
	String firstname;
	void setFatherData(String firstname)
	{
		this.firstname=firstname;
	}
    void display()
     {   super.display();
    	System.out.println(firstname+" "+super.firstname+" "+lastname);
    }
}
