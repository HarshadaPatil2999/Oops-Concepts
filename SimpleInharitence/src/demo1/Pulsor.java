package demo1;

public class Pulsor extends Bike {
	int weight;
	String name,modelno;
	
	void setPulsorData(int weight,String name,String modelno)
	{
		this.weight=weight;
		this.name=name;
		this.modelno=modelno;
	}
	void engine()
	{
		System.out.println("220 cc");
	}
public String toString()
{
	return name+" "+brand+" "+modelno+" "+milage+" "+weight+" "+price+" "+color;
}
}
