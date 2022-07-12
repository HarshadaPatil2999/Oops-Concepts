package demo2;

public  abstract class Car {
	int price;
	String brand;
	void setData(int price,String brand)
	{
		this.price=price;
		this.brand=brand;
	}
	
	void wheels()
	{
		System.out.println("4 wheels");
	}
	
 void gears()
 {
	 System.out.println("5 gears");
 }
 abstract void noofseats();
abstract void dashBoard();
abstract void engine();
abstract void wheelType();

}
