package demo3;

public class Activa extends Bike {
	String modelno,engine,modeofpayment;
	void setActivaData(String modelno,String engine,String modeofpayment)
	{
		this.modelno=modelno;
		this.engine=engine;
		this.modeofpayment=modeofpayment;
	}
	void display()
	{super.display();
		System.out.println(modelno+" "+engine+" "+modeofpayment);
	}
	void gears()
	{
		System.out.println(" Activa has no gears");
	}
	void features()
	{
		System.out.println("Features of Activa are: Analog speedometer,Analog Tachometer");
	}
	void seatNo()
	{
		System.out.println("No of seats in Activa is 1 seat");
	}
	void discount()
	{
		if(modeofpayment.equals("Fullpayment")) 
		{
			float discount=(price*15)/100;
			float newprice=price-discount;
			System.out.println("new price of Pulsor is:"+newprice);
			
		}
		else if(modeofpayment.equals("Halfpayment")) 
		{
			float discount=(price*10)/100;
			float newprice=price-discount;
			System.out.println("new price of Pulsor is:"+newprice);
			
		}
		else
			System.out.println("no discount...");
	}
	


}
