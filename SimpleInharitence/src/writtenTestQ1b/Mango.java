package writtenTestQ1b;

public class Mango extends Fruit {
	String typesofmangoes;

	public String getTypesofmangoes() {
		return typesofmangoes;
	}

	public void setTypesofmangoes(String typesofmangoes) {
		this.typesofmangoes = typesofmangoes;
	}
public String toString()
{
	return name+" "+color+" "+typesofmangoes;
}
}
