package writtenTestQ1a;

public class Dog extends Animal {
	String typeofdog;

	public String getTypeofdog() {
		return typeofdog;
	}

	public void setTypesofdog(String typesofdog) {
		this.typeofdog = typeofdog;
	}
	void bark()
	{
		System.out.println("barking...");
	}
	
	
public String toString()
{
	return typeofanimal+" "+typeofdog;
}
}
