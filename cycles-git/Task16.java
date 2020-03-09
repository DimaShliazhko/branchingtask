package by.htp.task.cycles;

/*
 * вычислить 
 * (1+2)*(1+2+3)*...*(1+2+..+10)
 */

public class Task16 {
	
	public static void main(String[] args) {
		
		
		double p,s;
		
		p = 1;
		for( int i = 1; i < 10; i++ ) {
		System.out.println("интерация "+i);
		s = 0;
			for( int j = 1; j <= i+1; j++  ) {
				
				s = s + j;
				System.out.println("s= "+s);
				
				
			}
			p = p * s;
			System.out.println("p = "+p);
		}
		
	}

}
