package demo4;

import java.util.Arrays;

public class Institute {
	int id;String name;Branch b[];


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Branch[] getB() {
		return b;
	}


	public void setB(Branch[] b) {
		this.b = b;
	}
	public String toString()
	{
		return id+" "+name+Arrays.toString(b);
	}

}
