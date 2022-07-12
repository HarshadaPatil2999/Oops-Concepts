package aggregationContainment;

public class CarDrivermain {
public static void main(String[] args) {
	
	Driver d1=new Driver(101,"raj","7865463421");
	Driver d2=new Driver(102,"ramesh","9876543423");
	Car c1=new Car(1,"crita","maruti",d1 );
	
	Car c2=new Car(2,"Desire","maruti",d2 );
	System.out.println(c1);
	System.out.println(c2);
}
}
