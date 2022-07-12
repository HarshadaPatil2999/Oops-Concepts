package demo4;

import java.util.Arrays;

public class Topic {
	int Tid;String Tname;SubTopic sub[] ;


	public int getTId() {
		return Tid;
	}


	public void setTId(int Tid) {
		this.Tid = Tid;
	}


	public String getTName() {
		return Tname;
	}


	public void setTName(String Tname) {
		this.Tname = Tname;
	}


	public SubTopic[] getSub() {
		return sub;
	}


	public void setSub(SubTopic[] sub) {
		this.sub = sub;
	}
	public String toString()
	{
		return Tid+" "+Tname+" "+Arrays.toString(sub);
	}

}
