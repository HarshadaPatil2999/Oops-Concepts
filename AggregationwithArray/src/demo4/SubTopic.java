package demo4;

import java.util.Arrays;

public class SubTopic {
	int Sid;String Sname;Question Que[];


	public int getSId() {
		return Sid;
	}


	public void setSId(int Sid) {
		this.Sid = Sid;
	}


	public String getSName() {
		return Sname;
	}


	public void setSName(String Sname) {
		this.Sname = Sname;
	}


	public Question[] getQue() {
		return Que;
	}


	public void setQue(Question[] que) {
		Que = que;
	}
	public String toString()
	{
		return Sid+" "+Sname+Arrays.toString(Que);
	}

}
