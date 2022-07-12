package Assignmentonvoerloading;
import java.util.Scanner;
public class Kid {
	void readbook(String a[],String b[])
	{int count =0;
		for(int i=0;i<1;i++)
	
	{ if(1==1)
	{for(int j=0;j<1;j++)
	{if(a[i]==b[i])
	{
		count++;
	}
	}if(count==1)
	{
		System.out.println("kids read same book");
	}
	else
		System.out.println("kids read different book");
	 }	
	}
	}
	void readbook(String c,String d)
	{if(c==d)
	{
		System.out.println("kids read same book");
	}
	else
		System.out.println("kids read different book");
		
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String a[]=new String[1];
		String b[]=new String[1];
		String c,d;
		Kid k=new Kid();
		System.out.println("Enter a[] and b[]");
		for(int i=0;i<1;i++)
		{
			a[i]=sc.next();
		}
		for(int j=0;j<1;j++)
		{
			b[j]=sc.next();
		}
		k.readbook(a, b);
		System.out.println();
		System.out.println("Enter c and d");
		c=sc.next();
		d=sc.next();
		k.readbook(c, d);
		
		
	}

}
