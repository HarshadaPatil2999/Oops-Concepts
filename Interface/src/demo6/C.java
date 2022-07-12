package demo6;

 abstract class A{
	abstract void display();
//	{
//		System.out.println(" in parent class display");
//	}
}
interface ABC
{
	void display();
	void show();
}

public class C extends A implements ABC{
	
	public void display()
	{//super.display();
		System.out.println(" child class display");//if we not create a display method in child class 
	}                                              //then display method is execute in parent class.
	public void show()
	{
		System.out.println("show child class ");
	}
	public static void main(String[] args) {
		C c1=new C();
		c1.display();
		c1.show();
	}
}