package writtenTestQ3;

import java.util.Arrays;

public class Person {
	int id;
	String pname,address,contact;
	IdProof IdP[];
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public IdProof[] getIdP() {
		return IdP;
	}
	public void setIdP(IdProof[] idP) {
		IdP = idP;
	}
	public String toString()
	{
		return id+" "+pname+" "+address+" "+contact+" "+Arrays.toString(IdP);
	}

}
