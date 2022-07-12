package demo4;
import java.util.Scanner;
import java.util.Arrays;
public class IntituteMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Institute in[]=new Institute[1];
		for(int i=0;i<1;i++)
		{
			System.out.println("Enter :Institute id,Institute name,Information About Institute:");
			int id=sc.nextInt();
			String name=sc.next();
			
			Branch b[]=new Branch[3];
			for(int j=0;j<3;j++)
			{
				System.out.println("Enter :Branch id,Branch name,Information About Branch:");
				int b_id=sc.nextInt();
			  String b_name=sc.next();
				 
				 Subject s[]=new Subject[2];
				 for(int m=0;m<2;m++)
				 {
					 System.out.println("Enter :Subject id,Subject name,Information About Subjects:");
					int S_id=sc.nextInt();
					String S_name=sc.next();
					 
					 Topic t[]=new Topic[2];
					 for(int p=0;p<2;p++)
					 {
						 System.out.println("Enter :Topic id,Topic name,Information About Topic:");
						int Tid=sc.nextInt();
						String Tname=sc.next();
						 
						 SubTopic sub[]=new SubTopic[2];
						 for(int n=0;n<2;n++)
						 {
							 System.out.println("Enter :Sub Topic id,Sub Topic name,Information About Sub Topic:");
							int Sid=sc.nextInt();
							String Sname=sc.next();
							 
							 Question Que[]=new Question[3];
							 for(int k=0;k<3;k++)
							 {
								 System.out.println("Enter :Question id,Question name");
								int Qid=sc.nextInt();
								 String Qname=sc.next(); 
								 Question q=new Question();
								 
								 q.setQId(Qid);
								 q.setQName(Qname);
								 Que[k]=q;
								 
							 }
							 
							 SubTopic sub1=new SubTopic();
							 sub1.setSId(Sid);
							 sub1.setSName(Sname);
							 sub1.setQue(Que);
							 
							 sub[n]=sub1;
						 }
						 Topic t1=new Topic();
						 t1.setTId(Tid);
						 t1.setTName(Tname);
						 t1.setSub(sub);
						 
						 t[p]=t1;
					 }
					 Subject s1=new Subject();
					 s1.setS_Id(S_id);
					 s1.setS_Name(S_name);
					 s1.setTop(t);
					 
					 s[m]=s1;
				 }
				 
				 Branch b1=new Branch();
				 b1.setB_Id(b_id);
				 b1.setB_Name(b_name);
				 b1.setS(s);
				 
				 b[j]=b1;
			}
			Institute i1=new Institute();
			i1.setId(id);
			i1.setName(name);
			i1.setB(b);
			
			in[i]=i1;
		}
		System.out.println(Arrays.toString(in));
		
	}

}
