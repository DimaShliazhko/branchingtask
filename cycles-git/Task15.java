package by.htp.task.cycles;

/*
 * вычислить 1+2+4+8+...20 в 10 степени
 * 
 */

public class Task15 {

	public static void main(String[] args) {
		long s = 0;
		
	
		for (int i = 1 ; i <= Math.pow(2, 10); i = i*2) {
			System.out.println("i = "+i);
			s = s+i;
			System.out.println("s = "+s);
			
			
		}
		
	}
	
}
