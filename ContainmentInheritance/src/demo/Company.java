package demo;

public class Company {
	int cid,year;
	String cname;
	Car c;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Car getC() {
		return c;
	}
	public void setC(Car c) {
		this.c = c;
	}

	public String toString() {
		return  cid + " "+ cname + " "+ year+" "+c;
	}
	
	
	
	

}
