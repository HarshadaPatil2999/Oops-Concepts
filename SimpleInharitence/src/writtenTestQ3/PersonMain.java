package writtenTestQ3;
import java.util.Arrays;
import java.util.Scanner;
public class PersonMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Person p[]=new Person[3];
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter: id,Person name,address,contact,Details of IdProof");
			int id=sc.nextInt();
			String pname=sc.next();
			String address=sc.next();
			String contact=sc.next();
			
			IdProof IdP[]=new IdProof[2];
			for(int j=0;j<2;j++)
			{
				System.out.println("Enter:name,number,validity");
				String name=sc.next();
				String number=sc.next();
				String validity=sc.next();
				
				IdProof I1=new IdProof();
				I1.setName(name);
				I1.setNumber(number);
				I1.setValidity(validity);
				
				IdP[j]=I1;
			}	
			
			Person p1=new Person();
			p1.setId(id);
			p1.setPname(pname);
			p1.setAddress(address);
			p1.setContact(contact);
			p1.setIdP(IdP);
			
			p[i]=p1;
		}
		  System.out.println(Arrays.toString(p));
		  
		for(Person s:p)
		{
			for(IdProof i:s.IdP)
			{
				if(i.getName().equals("AdharCard") && s.getAddress().equals("Pune"))
				{
					System.out.println(s.id+" "+s.pname+" "+s.address+" "+i.name+" "+i.number+" "+i.validity+" "+s.contact);
				}
			}
		}
		
	}
	

}
