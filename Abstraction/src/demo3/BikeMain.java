package demo3;

public class BikeMain {
	public static void main(String[] args) {
		Pulsor p=new Pulsor();
		p.setBikeData("Bajaj", " Blue", 200000);
		p.setPulsorData("Pulsor250", "250cc", "Fullpayment");
		p.display();
	
		p.wheelNo();
		p.gears();
	   p.features();
	   p.seatNo();
		p. discount();
		System.out.println();
		
		Activa a= new Activa() ;
		a.setBikeData("Honda", "PearlPreciousWhite", 70000);
		a.setActivaData("6G", "109 cc", "Halfpayment");
		a.display();
		
		a.wheelNo();
		a.gears();
	   a.features();
	   a.seatNo();
		a. discount();
	}
	

}
