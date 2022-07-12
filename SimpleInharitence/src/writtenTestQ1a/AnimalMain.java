package writtenTestQ1a;
import java.util.Scanner;
public class AnimalMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Dog d1=new Dog();
		System.out.println(" Enter: Type of Animal,Type of Dog");
		String typeofanimal=sc.next();
		String typeofdog=sc.next();
		d1.setTypeofanimal(typeofanimal);
		d1.setTypesofdog(typeofdog);
		System.out.println(d1);
		d1.legs();
		d1.eyes();
		d1.tail();
		d1.bark();
		d1.eat();
		
	
		
	}

}
