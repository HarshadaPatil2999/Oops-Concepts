package demo3;

public class Facualty extends Person {
	int id,salary;
	char performance;
	String subject;
	void setFacultyData(int id,String subject,int salary,char performance)
	{
		this.id=id;
		this.subject=subject;
		this.salary=salary;
		this.performance=performance;
	}
	
	void bonus()
	{
		switch(performance)
		{
		case 'A':{    float bonus=(salary*20)/100;
	                  float newSalary=salary+bonus;
	              System.out.println(" new Salary:"+newSalary);
	             }
		break;
		case 'B':{    float bonus=(salary*15)/100;
                   float newSalary=salary+bonus;
                 System.out.println(" new Salary:"+newSalary);
                }
       break;
		case 'C':{    float bonus=(salary*10)/100;
                    float newSalary=salary+bonus;
               System.out.println(" new Salary:"+newSalary);
                 }
      break;
		case 'D':{    float bonus=(salary*5)/100;
                    float newSalary=salary+bonus;
                System.out.println(" new Salary:"+newSalary);
                }
     break;
     
     default:
    	 System.out.println("very less performance.....");
			
		}
	}
	
//void bonus()
//{
//	if(performance=='A')
//	{float bonus=(salary*20)/100;
//	float newSalary=salary+bonus;
//		System.out.println(" new Salary:"+newSalary);
//	}
//	else if(performance=='B')
//	{
//		float bonus=(salary*15)/100;
//		float newSalary=salary+bonus;
//		System.out.println(" new Salary:"+newSalary);
//	}
//	else if(performance=='C')
//	{
//		float bonus=(salary*10)/100;
//		float newSalary=salary+bonus;
//		System.out.println(" new Salary:"+newSalary);
//	}
//	else if(performance=='D')
//	{
//		float bonus=(salary*5)/100;
//		float newSalary=salary+bonus;
//		System.out.println("new Salary:"+newSalary);
//	}
//	else
//		System.out.println("very less performance...");
//}

public String toString()
{
	return id+" "+name+" "+subject+" "+performance+" "+salary;
}

}
