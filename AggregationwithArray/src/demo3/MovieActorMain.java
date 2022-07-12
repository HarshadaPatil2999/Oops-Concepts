package demo3;
import java.util.Scanner;
import java.util.Arrays;
public class MovieActorMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Movie mov[]=new Movie[3];
		for(int i=0;i<3;i++)
		{
			System.out.println("Movie no"+(i+1)+"  id,movie name,box office collection,Actors detail");
			int mid=sc.nextInt();
			String mname=sc.next();
			int boxofficecollection=sc.nextInt();
			
			Actor act[]=new Actor[2];
			for(int j=0;j<2;j++)
			{
				System.out.println("Actor no"+(j+1)+"  id,name,birth year,address");
				int id=sc.nextInt();
				String name=sc.next();
				int birthyear=sc.nextInt();
				String address=sc.next();
				
				Actor a=new Actor();
				a.setId(id);
				a.setName(name);
				a.setBirthyear(birthyear);
				a.setAddress(address);
				act[j]=a;
				
			}
			Movie m=new Movie();
			m.setMid(mid);
			m.setMname(mname);
			m.setBoxofficecollection(boxofficecollection);
			m.setAct(act);
			mov[i]=m;
		}
		System.out.println(Arrays.toString(mov));
		
		for(Movie s:mov)
		{
			for(Actor c:s.act)
			{
				if(c.getName().equals("Salamankhan") && s.getBoxofficecollection()>5000000)
				{
					System.out.println(s.mname+" "+s.boxofficecollection+" "+c.id+" "+c.name+" "+c.birthyear+" "+c.address);
				}
			}
		}
		
		
	}

}
