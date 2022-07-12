package demo4;

public interface Collage {
	
	void Id();
	void Uniform();
	void Transport();
	default void  canteen()
	{
		System.out.println("canteen is  not compulsory");
	}

default void laboratory()
{
	System.out.println("laboratory is available for all");
}
static void  collagename()
{
	System.out.println("ABC collage");
}
private void accounts()
{
	System.out.println("Accounts are private ");
}
default void library()
{accounts();
	System.out.println(" library membership is compulsory");
}


}
