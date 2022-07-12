package Overloadingploymorphism;

public class Additionofnumbers {
	void add(int a,int b)
	{
		System.out.println("Addition of 2 int no:"+(a+b));
	}
	void add(float a,float b)
	{
		System.out.println("Addition of 2 float no:"+(a+b));
	}
	void add(float a,int b)
	{
		System.out.println("Addition of (float ,int )no:"+(a+b));
	}
	void add(int a,int b,float c)
	{
		System.out.println("Addition of( 2 int,float) no:"+(a+b+c));
	}
	void add(float a,int b,int c)
	{
		System.out.println("Addition of(float, 2 int) no:"+(a+b+c));
	}
	void add(String a,String b)
	{
		System.out.println("Addition of 2 string no:"+(a+b));
	}
	public static void main(String[] args) {
		Additionofnumbers a=new Additionofnumbers();
		a.add(10, 20);
		a.add(20.0f, 23.0f);
		a.add(10.0f, 34);
		a.add(13.0f, 23, 45);
		a.add("abc", "xyz");
		
	}




}
