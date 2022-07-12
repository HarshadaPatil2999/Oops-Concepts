package demo2;


public class  Student implements  Addmission , Collage {//we can implement one or more interface in  child class 
	public void Id()
	 {
		 System.out.println("Id taken from collage");
	 }
	public void Uniform()
	 {
		 System.out.println("collage has a uniform");
	 }
	public void Transport()
	{
		System.out.println("Transport is not compulsory");
	}
	
	
	 public void Marksheet10()
	 {
		 System.out.println("10th marksheet:yes");
	 }
	 public void Marksheet12()
	 {
		 System.out.println("12th marksheet:yes");
	 }
	 public void LeavingCertificate()
	 {
		 System.out.println("Leaving Certificate:yes");
	 }
	public void NationalityCertificate()
	 {
		 System.out.println("Nationality Certificate:yes");
	 }
	public void IncomeCertificate()
	{
		 System.out.println("Income Certificate:yes");
	}
	public void AdharCard()
	{
		 System.out.println("Adhar Card:yes");
	}
	
}
