package demo2;



public class Company {
	int cid,year;
	String cname;
	Car c;
	Company(int cid,String cname, int year ,Car c)
	{
		this.cid=cid;
		this.cname=cname;
		this.year=year;
		this.c=c;
	}
	public String toString() {
		return  cid + " "+ cname + " "+ year+" "+c;
	}
	

}
