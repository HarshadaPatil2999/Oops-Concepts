package demo;

public class A {//can not be sub classed or inheritated with final keyword.it is limitatation on class.
 int a=30;//constant variable while using final keyword it variable value can not be changed.
	  A() 
	  {
		  System.out.println("default constuctor A");
	  }
	 
A(int a)
{
	System.out.println("single parameter A"+a);
}
 void  display()//child class can not override the method with final keyword.
{
	System.out.println("display in A class:"+a);
	
}
public static void main(String[] args) {
	B b=new B(15);
	b.display();

}

}
class B extends A{
 int a=20;//chile class can not 
 int b=30;
	B()
	{  super(100);
		System.out.println("default constuctor B");
	}
	B(int a)
	{  super();
		System.out.println("1 parameter B:"+a);
	}
	void display()
	{//System.out.println("display in A class:"+super.a);
		super.display();
		System.out.println("display method in class B:"+a);
	}
	
	
	
}