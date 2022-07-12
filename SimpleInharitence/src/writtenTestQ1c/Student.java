package writtenTestQ1c;

public class Student extends Person {
String  dept;
int marks;
public String getDept() {
	return dept;
}



public void setDept(String dept) {
	this.dept = dept;
}



public int getMarks() {
	return marks;
}



public void setMarks(int marks) {
	this.marks = marks;
}
void collagename()
{
	System.out.println("ABC collage...");
}



public String toString()
{
	return name+" "+age+" "+dept+" "+marks;
}
}
