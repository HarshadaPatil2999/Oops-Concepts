package writtenTestQ2;
import java.util.Scanner;
public class Laptop {
	int noOfUSBPort;
	 float processerSpeed;

	public int getNoOfUSBPort() {
		return noOfUSBPort;
	}

	public void setNoOfUSBPort(int noOfUSBPort) {
		this.noOfUSBPort = noOfUSBPort;
	}

	public float getProcesserSpeed() {
		return processerSpeed;
	}

	public void setProcesserSpeed(float processerSpeed) {
		this.processerSpeed = processerSpeed;
	}

public String toString() {
		return  noOfUSBPort +" "+processerSpeed;
	}
	

}
