package by.htp.task.cycles;

/*
 * дано натуральное число n 
 * вычислить 1+ 1/2+1/3+1/4+....1/n
 * 
 */

public class Task14 {
	
	public static void main(String[] args) {
		
		int n;
		double s;
		s = 0;
		n = 19;
		for (  int i = 1; i <= n; i++  ) {
			
			System.out.println("i = "+i);
			s = s + 1.0/i;
			System.out.println("s = "+s);
		}
		
	}

}
