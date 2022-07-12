package demo;

public class PulsorRs extends Pulsor {
	String engine;
	int speed;
	
	void setPulsorRsData(String engine,int speed)
	{
		this.engine=engine;
		this.speed=speed;
	}

	public String toString()
	{
		return name+" "+brand+" "+modelno+" "+milage+" "+weight+" "+price+" "+color+" "+engine+" "+speed;
	}
}
