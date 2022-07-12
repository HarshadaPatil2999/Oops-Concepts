package demo2;

public class Bike {
	int price;
	String brand,color,milage;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMilage() {
		return milage;
	}
	public void setMilage(String milage) {
		this.milage = milage;
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

}
