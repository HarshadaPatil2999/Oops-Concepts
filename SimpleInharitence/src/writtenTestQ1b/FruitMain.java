package writtenTestQ1b;
import java.util.Scanner;
public class FruitMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Mango m=new Mango();
		System.out.println("Enter: name,color,types of mango");
		String name=sc.next();
		String color=sc.next();
		String typesofmangoes=sc.next();
		
		m.setName(name);
		m.setTypesofmangoes(typesofmangoes);
		m.setColor(color);
		System.out.println(m);
		
	}

}
