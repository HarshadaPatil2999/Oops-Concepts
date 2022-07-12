package assignmentQ4;
import java.util.Scanner;
public class OverloadFunctionOfSeries {

	double series(double n)
	{
		double sum=0;
		 for(int i=1;i<=n;i++)
		 {
			 sum=sum+(1/i);
	      
		 }  System.out.println("sum of series n:"+sum);
		
		 return sum;
	}
	
	double series(double a,double n)//a=2 n=4
	{   double power=1, sum=0, b=1;
		for(int i=0;i<n;i++)
		{ 
			for(int j=0;j<b+1;j++)
			{
			 power=power*a;
			}
			sum=sum+(b/power);
			b=b+3;
			
		}
		
		System.out.println("sum of series a&n:"+sum);
		return sum;
		
	}	
		
		
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		double n, a;
		OverloadFunctionOfSeries o=new OverloadFunctionOfSeries();
		System.out.println("Enter double n");
		n=sc.nextDouble();
		o.series(n);
		System.out.println("Enter double a,double n");
		a=sc.nextDouble();
		n=sc.nextDouble();
		o.series(a, n);
		
	}
	
}
