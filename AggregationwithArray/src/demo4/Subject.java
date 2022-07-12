package demo4;

import java.util.Arrays;

public class Subject {
	int S_id;String S_name;Topic top[];


	public int getS_Id() {
		return S_id;
	}


	public void setS_Id(int S_id) {
		this.S_id = S_id;
	}


	public String getS_Name() {
		return S_name;
	}


	public void setS_Name(String S_name) {
		this.S_name = S_name;
	}


	public Topic[] getTop() {
		return top;
	}


	public void setTop(Topic[] top) {
		this.top = top;
	}
	public String toString()
	{
		return S_id+" "+S_name+Arrays.toString(top);
	}

}
