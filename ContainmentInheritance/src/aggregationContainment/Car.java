package aggregationContainment;
public class Car {
	int id;
	String name,brand;
	Driver d;
	Car(int id,String name,String brand,Driver d)
	{
		this.id=id;
		this.name=name;
		this.brand=brand;
		this.d=d;
	}
	public String toString()
	{
		return name+" "+brand+" "+d;
	}


}
