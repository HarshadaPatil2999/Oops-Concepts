package demo3;

public class Pulsor extends Bike {
	String modelno,engine,modeofpayment;
	void setPulsorData(String modelno,String engine,String modeofpayment)
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
		System.out.println(" Pulsor has 5 gears");
	}
	void features()
	{
		System.out.println("Features of Pulsor are: charging point,Analog speedometer,Digital Tachometer");
	}
	void seatNo()
	{
		System.out.println("No of seats in Pulsor are 2 seats");
	}
	void discount()
	{
		if(modeofpayment.equals("FullpaymentImmediately")) 
		{
			float discount=(price*15)/100;
			float newprice=price-discount;
			System.out.println("new price of Pulsor is:"+newprice);
			
		}
		else if(modeofpayment.equals("HalfpaymentImmediatly")) 
		{
			float discount=(price*10)/100;
			float newprice=price-discount;
			System.out.println("new price of Pulsor is:"+newprice);
			
		}
		else
			System.out.println("no discount...");
	}
	

}
