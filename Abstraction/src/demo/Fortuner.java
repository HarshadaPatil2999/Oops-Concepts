package demo;

public class Fortuner extends Car {
	void noofseats()
	{
		System.out.println("Fortuner has 8 seats");
	}
void dashBoard()
{
	System.out.println("music system,charging,meter,pendrive");
}
void engine() {
	System.out.println("2800 cc");
}
public String toString()
{
	return "Fortuner"+" "+brand+" "+price;
}
}
