package demo4;

public class Question {
	int Qid;String Qname;

	public int getQId() {
		return Qid;
	}

	public void setQId(int Qid) {
		this.Qid = Qid;
	}

	public String getQName() {
		return Qname;
	}

	public void setQName(String Qname) {
		this.Qname = Qname;
	}
public String toString()
{
	return Qid+" "+Qname;
}
}
