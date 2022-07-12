package demo3;

public class SciCalculator implements Calculator {
	int a=4,b=2;
	public void add()
	{
		System.out.println("Addition"+(a+b));
	}
	public void sub()
	{
		System.out.println("Substraction"+(a-b));
	}
	public void mul()
	{
		System.out.println("Multiplication"+(a*b));
	}
	public void div()
	{
		System.out.println("Division:"+(a/b));
	}
	void power()
	{ double power=Math.pow(a, b);
		System.out.println("Power:"+power);
	}
	void Squreroot()
	{
		double squreroot=Math.sqrt(a);
		System.out.println("Squre root:"+squreroot);
	}

}
