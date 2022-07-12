package demo2;

public class AddmissionCollageMain {
	public static void main(String[] args) {
		
		Addmission a1=new Student();//upcasting or run time ploymorphism
		System.out.println(Addmission.name);
		a1. Marksheet10();
		a1. Marksheet12();
		a1. LeavingCertificate();
		a1. NationalityCertificate();
		a1. IncomeCertificate();
		a1. AdharCard();
		
		Collage c1=new Student();
		c1.Uniform();
		c1.Id();
		c1.Transport();
		
		
		
		
//		Student s1=new Student();
//		System.out.println(Addmission.name);
//		s1. Marksheet10();
//		s1. Marksheet12();
//		s1. LeavingCertificate();
//		s1. NationalityCertificate();
//		s1. IncomeCertificate();
//		s1. AdharCard();
		// s1.Uniform();
		//s1.Id();
	}

}
