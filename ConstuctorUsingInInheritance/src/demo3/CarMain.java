package demo3;
import java.util.Scanner;
public class CarMain {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	
	System.out.println(" Enter: Name,Brand,launchyear,price,id,modelno,modeofpayment,paymode");
	String name=sc.next();
	String brand=sc.next();
	int launchyear=sc.nextInt();
	int price=sc.nextInt();
	int id=sc.nextInt();
	String modelno=sc.next();
	String modeofpayment=sc.next();
	String paymode=sc.next();
	
	Maruti m=new Maruti();
	m.setCarData(name, brand, launchyear, price);
	m.setMarutiData(id, modelno, modeofpayment, paymode);
	m.discount();
	m.display();
}
}
