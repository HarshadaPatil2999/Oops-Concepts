package demo;

public class CarMain {
	public static void main(String[] args) {
		Innova i=new Innova();
		i.setData(2000000, "Toyota");
		System.out.println(i);
		i.dashBoard();
		i.engine();
		i.noofseats();
		
		System.out.println();
		Fortuner f=new Fortuner();
		f.setData(4500000, "Toyota");
		System.out.println(f);
		f.dashBoard();
		f.engine();
		f.noofseats();
	}

}
