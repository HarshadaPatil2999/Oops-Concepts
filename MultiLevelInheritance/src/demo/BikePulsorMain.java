package demo;
import java.util.Scanner;
public class BikePulsorMain {
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
		PulsorRs ps=new PulsorRs();
		ps.setBikeData(100000, "Bajaj", "Black", "40km/ltr");
		ps.setPulsorData(150, "PulsorRs", " RS150");
		ps.setPulsorRsData("BS6", 140);
		System.out.println(ps);
		ps.wheelno();
		ps.seats();
		ps.gears();
	}

}
