package demo4;

import java.util.Arrays;

public class Branch {
	int b_id;String b_name;Subject s[];


	public int getBR_Id() {
		return b_id;
	}


	public void setB_Id(int b_id) {
		this.b_id = b_id;
	}


	public String getB_Name() {
		return b_name;
	}


	public void setB_Name(String b_name) {
		this.b_name = b_name;
	}


	public Subject[] getS() {
		return s;
	}


	public void setS(Subject[] s) {
		this.s = s;
	}
	public String toString()
	{
		return b_id+" "+b_name+Arrays.toString(s);
	}

}
