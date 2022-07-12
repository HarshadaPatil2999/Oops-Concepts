package demo2;
import java.util.Scanner;


public class CompanyMain {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int id,cid,year,price;
	String name,cname,model;
	Car c;
	System.out.println("Enter:id,name,model,price");
	id=sc.nextInt();
	name=sc.next();
	model=sc.next();
	price=sc.nextInt();
	Car c1=new Car(id,name,model,price);
	
	
	System.out.println("Enter:cid,cname,year");
	cid=sc.nextInt();
	cname=sc.next();
	year=sc.nextInt();
	
 Company d1=new Company( cid,cname,year,c1);
	System.out.println(d1);
	
	System.out.println("Enter:cid,cname,year");
	cid=sc.nextInt();
	cname=sc.next();
	year=sc.nextInt();
	
	Company d2=new Company( cid,cname,year,c1);
	System.out.println(d2);
	
	System.out.println("Enter:cid,cname,year");
	cid=sc.nextInt();
	cname=sc.next();
	year=sc.nextInt();
	
	Company d3=new Company( cid,cname,year,c1);
	System.out.println(d3);
	
	System.out.println("Enter:cid,cname,year");
	cid=sc.nextInt();
	cname=sc.next();
	year=sc.nextInt();
	
	Company d4=new Company( cid,cname,year,c1);
	System.out.println(d4);
	
	System.out.println("Enter:cid,cname,year");
	cid=sc.nextInt();
	cname=sc.next();
	year=sc.nextInt();
	
	Company d5=new Company( cid,cname,year,c1);
	System.out.println(d5);
	

}
}