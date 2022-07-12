package Overloadingploymorphism;

public class FindArea {
	void area(float r)
	{
		double areaofcircle=3.14*r*r;
		System.out.println("Area of circle:"+areaofcircle);
	}
	void area(float a,float b)
	{
		float areaofrectangle=a*b;
		System.out.println("Area of rectangle:"+areaofrectangle);
	}
	 int  area(int h,int b)
	{
       float areaoftriangle=(h*b)/2;
		System.out.println("Area of triangle:"+areaoftriangle);
	return (h*b)/2;
	}
	void area(int a)
	{
		float areaofsqure=a*a;
		System.out.println("Area of squre:"+areaofsqure);
	}
	public static void main(String[] args) {
		FindArea area=new FindArea();
		area.area(5.0f);
		area.area(4);
		area.area(3.0f, 6.0f);
		area.area(3, 5);
		
	}
	
	

}
