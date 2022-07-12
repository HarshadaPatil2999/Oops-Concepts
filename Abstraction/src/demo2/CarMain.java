package demo2;

import demo.Fortuner;

public class CarMain {
	public static void main(String[] args) {
		InnovaCresta i=new InnovaCresta();
		i.setData(2000000, "Toyota");
		System.out.println(i);
		i.dashBoard();
		i.engine();
		i.noofseats();
		i.wheelType();
		
		System.out.println();
		
		FortunerDieselAT f=new FortunerDieselAT();
		f.setData(4500000, "Toyota");
		System.out.println(f);
		f.dashBoard();
		f.engine();
		f.noofseats();
		f.wheelType();
		
		
	}

}
