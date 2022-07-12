package wrritenTestQ2;


class CSK extends IPLTeam {
	
	
}

class RCB extends IPLTeam{
	
}


public class IPLTeam {
	void play()
	{
		System.out.println("playing Cricket... ");
	}
	public static void main(String[] args) {
		CSK c=new CSK();
		c.play();
		
		System.out.println();
		
		RCB r=new RCB();
		r.play();
		
	}

	
}
