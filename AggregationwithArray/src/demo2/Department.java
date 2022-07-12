package demo2;

import java.util.Arrays;

public class Department {
String dname;
int totalnoemp;
Employee emp[];

public String getDname() {
	return dname;
}

public void setDname(String dname) {
	this.dname = dname;
}

public int getTotalnoemp() {
	return totalnoemp;
}

public void setTotalnoemp(int totalnoemp) {
	this.totalnoemp = totalnoemp;
}

public Employee[] getEmp() {
	return emp;
}

public void setEmp(Employee[] emp) {
	this.emp = emp;
}

public String toString()
{
	return dname+" "+totalnoemp+" "+Arrays.toString(emp);
}

}
