package assignmentQ3;
import java.util.Scanner;
public class Compare {
	
		Scanner sc=new Scanner(System.in);
		void compare(int a,int b)
		{
			if(a>b)
			{
				System.out.println(" int a is greater");
			}
			else
				System.out.println(" int b is greater");
		}
		void compare(char c,char d)
		{
			if(c>d)
			{
				System.out.println("char c is greater");
			}
			else
				System.out.println(" char d is greater");
		}
		
		
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			Compare c1=new Compare();
			System.out.println("Enter int a,int b");
			int a,b;
			a=sc.nextInt();
			b=sc.nextInt();
			c1.compare(a, b);
			System.out.println();
			char c,d;
			System.out.println("Enter char c,char d");
			c=sc.next().charAt(0);
			d=sc.next().charAt(0);
			c1.compare(c, d);
			
			
			
		}
	}


