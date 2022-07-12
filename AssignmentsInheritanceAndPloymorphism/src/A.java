
public class A {
String s="Class A";

}

class B extends A{
	String s="Class B";
	public B()
	{
		System.out.println(super.s);
	}
}
class C extends B{
	String s="Class C";
	public C()
	{
		System.out.println(super.s);
	}
}

  
 
