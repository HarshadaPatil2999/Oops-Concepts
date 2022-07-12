package demo1;

public class Bike {
	int price;
	String brand,color,milage;
	void setBikeData(int price,String brand,String color,String milage)
	{
		this.price=price;
		this.brand=brand;
		this.color=color;
		this.milage=milage;
	}
	void gears()
	{
		System.out.println("4 gears");
	}
	void wheelno()
	{
		System.out.println("2 wheels");
	}
void seats()
{
	System.out.println("2 seats");
}
//public String toString()
//{
//	return brand+" "+color+" "+milage+" "+price;
//}
}
