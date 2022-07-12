package demo;

public class FatherMain {
	public static void main(String[] args) {
		Son s=new Son();
		s.setFatherData("Raj", "Patil", 20);
		s.setSonData("B.E");
		System.out.println(s);
		
		Daughter d=new Daughter();
		d.setFatherData("Riya", "Patil", 24);
		d.setDaugtherData("Activa 5G");
		System.out.println(d);
	}

}
