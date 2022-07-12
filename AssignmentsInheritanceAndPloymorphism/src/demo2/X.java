package demo2;

public class X {
	public X(int i)
	{
		System.out.println(1);
	}
	public static void main(String[] args) {
		Y y=new Y();//create a object in main method for display the output.
	}
	
	
	

}
class Y extends X{
	public Y()
	{ super(100);//create super constuctor X().it must be created while error will be shown
		System.out.println(2);
	}
	
}