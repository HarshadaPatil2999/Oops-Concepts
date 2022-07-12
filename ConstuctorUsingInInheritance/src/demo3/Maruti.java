package demo3;

public class Maruti extends Car {
	int id;
	String modelno,modeofpayment,paymode;
	void setMarutiData(int id,String modelno,String modeofpayment,String paymode)
	{
		this.id=id;
		this.modelno=modelno;
		this.modeofpayment=modeofpayment;
		this.paymode=paymode;
	}

void display()
{
	super.display();
	System.out.println(id+""+modelno+" "+modeofpayment+" "+paymode);
}
void discount() {
	if(modeofpayment.equals("Fullpayment")&& paymode.equals("online") || paymode.equals("offline"))
	{
		float discount=(price*15)/100;
		float newprice=price-discount;
		System.out.println("New price:"+newprice);
	}
	else if(modeofpayment.equals("2Installment")&& paymode.equals("online")|| paymode.equals("offline"))
	{
		float discount=(price*10)/100;
		float newprice=price-discount;
		System.out.println("New price:"+newprice);
	}
	else if(modeofpayment.equals("3Installment")&& paymode.equals("online")|| paymode.equals("offline"))
	{
		float discount=(price*5)/100;
		float newprice=price-discount;
		System.out.println("New price:"+newprice);
	}
	else
		System.out.println("No discount....");
}
}
