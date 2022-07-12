package demo;

public class Pulsor extends Bike {
	int weight;
	String name,modelno;
	
	void setPulsorData(int weight,String name,String modelno)
	{
		this.weight=weight;
		this.name=name;
		this.modelno=modelno;
	}
	void gears()
	{super.gears();
		System.out.println("Pulsor have 5 gears..");
	}
	
}
