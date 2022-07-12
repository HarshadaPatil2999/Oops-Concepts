package demo3;

public class Institute {
	int id;String name;
	Branch b;
	void setInstituteData(int id,String name,Branch b)
	{
		this.id=id;
		this.name=name;
		this.b=b;
	}
	public String toString()
	{
		return id+" "+name+" "+b;
	}

}
class Branch
{
	int id;String name;
	Subject sub;
	void setBranchData(int id,String name,Subject sub)
	{
		this.id=id;
		this.name=name;
		this.sub=sub;
	}
	public String toString()
	{
		return id+" "+name+" "+sub;
	}
}
class Subject{
	int id;String name;
	Topic top;
	void setSubjectData(int id,String name,Topic top)
	{
		this.id=id;
		this.name=name;
		this.top=top;
	}
	public String toString()
	{
		return id+" "+name+" "+top;
	}
}
class Topic{
	int id;String name;
	SubTopic subtop;
	void setTopicData(int id,String name,SubTopic subtop)
	{
		this.id=id;
		this.name=name;
		this.subtop=subtop;
	}
	public String toString()
	{
		return id+" "+name+" "+subtop;
	}
}
class SubTopic{
	int id;String name;
	Question Que;
	void setSubTopicData(int id,String name,Question Que)
	{
		this.id=id;
		this.name=name;
		this.Que=Que;
	}
	public String toString()
	{
		return id+" "+name+" "+Que;
	}
}
class Question{
	int id;String name;
	void setQuestionData(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return id+" "+name;
	}
}
