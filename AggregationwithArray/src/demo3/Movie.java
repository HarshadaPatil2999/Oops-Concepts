package demo3;

import java.util.Arrays;

public class Movie {
	int mid,boxofficecollection;
	String mname;
	Actor act[];
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public int getBoxofficecollection() {
		return boxofficecollection;
	}
	public void setBoxofficecollection(int boxofficecollection) {
		this.boxofficecollection = boxofficecollection;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public Actor[] getAct() {
		return act;
	}
	public void setAct(Actor[] act) {
		this.act = act;
	}
	public String toString()
	{
		return mid+" "+mname+" "+boxofficecollection+" "+Arrays.toString(act);
	}

}
