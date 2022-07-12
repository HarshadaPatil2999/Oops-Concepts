package demo;
import java.util.Scanner;
public class CompanyMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		int id,cid,year,price;
		String name,cname,model;
		 Car c;
		 Car c1=new Car();
		System.out.println("Enter:id,name,model,price");
		id=sc.nextInt();
		name=sc.next();
		model=sc.next();
		price=sc.nextInt();
		c1.setId(id);//1
		c1.setName(name);//maruti
		c1.setModel(model);//swift
		c1.setPrice(price);//120000
		
		Company d1 =new Company();
		System.out.println("Enter:cid,cname,year");
		cid=sc.nextInt();
		cname=sc.next();
		year=sc.nextInt();
		 d1.setCid(cid);//101
		d1.setCname(cname);//fort
		d1.setYear(year);
		d1.setC(c1);
		System.out.println(d1);
		
		Company d2 =new Company();
		System.out.println("Enter:cid,cname,year");
		cid=sc.nextInt();
		cname=sc.next();
		year=sc.nextInt();
		
		d2.setCid(cid);
		d2.setCname(cname);
		d2.setYear(year);
		d2.setC(c1);
		System.out.println(d2);
			
		Company d3 =new Company();
		System.out.println("Enter:cid,cname,year");
		cid=sc.nextInt();
		cname=sc.next();
		year=sc.nextInt();
		
		d3.setCid(cid);
		d3.setCname(cname);
		d3.setYear(year);
		d3.setC(c1);
		
		System.out.println(d3);
		
			
		
	}

}
