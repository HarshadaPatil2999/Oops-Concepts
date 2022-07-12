package demo2;

public class Pulsor extends Bike {
	int weight;
	String name,modelno;
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModelno() {
		return modelno;
	}
	public void setModelno(String modelno) {
		this.modelno = modelno;
	}
	void engine()
	{
		System.out.println("220 cc");
	}
	public String toString()
	{
		return name+" "+brand+" "+modelno+" "+milage+" "+weight+" "+price+" "+color;
	}

}
