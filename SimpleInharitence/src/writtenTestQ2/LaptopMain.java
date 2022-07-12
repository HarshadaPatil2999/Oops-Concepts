package writtenTestQ2;

import java.util.Scanner;

public class LaptopMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int noOfUSBPort;
		float processerSpeed;
		    Laptop l1=new Laptop();
		System.out.println("Enter:No Of USB Port and Processer Speed ");
		 noOfUSBPort=sc.nextInt();
		 processerSpeed=sc.nextFloat();
		 l1.setNoOfUSBPort(noOfUSBPort);
		 l1.setProcesserSpeed(processerSpeed);
		System.out.println(l1.getNoOfUSBPort());
		System.out.println(l1.getProcesserSpeed()+"GHz  ");
		
	}

}
