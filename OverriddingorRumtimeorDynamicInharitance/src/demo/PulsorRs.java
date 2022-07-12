package demo;

public class PulsorRs extends Pulsor {
	String engine;
	int speed;
	
	void setPulsorRsData(String engine,int speed)
	{
		this.engine=engine;
		this.speed=speed;
	}
	void gears()
	{super.gears();
		System.out.println("Pulsor Rs have 6 gears..");
	}

	public String toString()
	{
		return name+" "+brand+" "+modelno+" "+milage+" "+weight+" "+price+" "+color+" "+engine+" "+speed;
	}
}
