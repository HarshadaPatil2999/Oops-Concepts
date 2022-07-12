package demo3;
import java.util.Scanner;
import java.util.Arrays;
public class InstituteMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
    	Question q=new Question();
		q.setQuestionData(1, "What is the Question?");
		//System.out.println(q);
		
		SubTopic s=new SubTopic();
		s.setSubTopicData(101, "Apple", q);
	//	System.out.println(s);
		
		Topic t=new Topic();
		t.setTopicData(111, "Fruit ", s);
	//	System.out.println(t);
		
		Subject su=new Subject();
		su.setSubjectData(1111, "GeneralKnowledge", t);
		//System.out.println(su);
		
		Branch b=new Branch();
		b.setBranchData(11111, "SocialScience", su);
		//System.out.println(b);
		
		Institute i=new Institute();
		i.setInstituteData(111111, "ABC Intitute", b);
		System.out.println(i);
	}

}
