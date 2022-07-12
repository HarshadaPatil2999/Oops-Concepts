package demo3;

public abstract class Bike {
	int price;
	String brand,color;
	
	void setBikeData(String brand,String color,int price)
	{
		this.brand=brand;
		this.color=color;
		this.price=price;
	}
	void display()
	{
		System.out.println(brand+" "+color+" "+price);
	}
	void wheelNo()
	{
		System.out.println("2 wheels");
	}
	void mirror()
	{
		System.out.println(" 2 mirror ");
	}
	abstract void gears();
	abstract void features();
	abstract void seatNo();
	abstract void discount();
	

}
