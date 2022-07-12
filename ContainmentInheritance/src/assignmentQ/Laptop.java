package assignmentQ;
import java.util.Scanner;
public class Laptop {
	int noOfUSBPort, processerSpeed;

	public int getNoOfUSBPort() {
		return noOfUSBPort;
	}

	public void setNoOfUSBPort(int noOfUSBPort) {
		this.noOfUSBPort = noOfUSBPort;
	}

	public int getProcesserSpeed() {
		return processerSpeed;
	}

	public void setProcesserSpeed(int processerSpeed) {
		this.processerSpeed = processerSpeed;
	}

public String toString() {
		return  noOfUSBPort +" "+processerSpeed;
	}
	

}
