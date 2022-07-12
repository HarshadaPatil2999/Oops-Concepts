package demo1;

public class BikeMain {
	public static void main(String[] args) {
		Pulsor p1=new Pulsor();
		p1.setBikeData(100000, "Bajaj", "color ", "60km/hr");
		p1.setPulsorData(120, "Pulsor", "Alpha");
		System.out.println(p1);
		p1.gears();
		p1.wheelno();
		p1.seats();
		p1.engine();
	}

}
