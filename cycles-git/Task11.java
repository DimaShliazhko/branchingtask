package by.htp.task.cycles;

/*
 * составить программу нахождения разности кубов первых 200 чисел
 * 
 */

public class Task11 {
	
	public static void main(String[] args) {
		
		double p;
		p = 0;
		for (int i = 1 ; i <= 200; i++) {
			
			p = 	p -  Math.pow(i, 3);
			
		} 
		System.out.println("разность кубов "+ p);
			
		
		
	}

}
