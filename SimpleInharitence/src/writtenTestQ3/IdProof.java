package writtenTestQ3;

public class IdProof {
	String name, number,validity;
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getValidity() {
		return validity;
	}
	public void setValidity(String validity) {
		this.validity = validity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
public String toString()
{
	return name+" "+number+" "+validity;
}
}

