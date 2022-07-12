package writtenTestQ1;

public class MachineMain {
	public static void main(String[] args) {
		Juicer j=new Juicer();
		j.crush();
		j.rotate();
		j.filter();
		
		System.out.println();
		
		Machine m=new Juicer();
		m.crush();
		m.rotate();
//	m.filter();//the method is undefined for machine type.
		
	}

}
