package by.htp.task.cycles;

/*
 * последовательность a(n) строиться так a1=1 a(n) =6 + a(n-1) ?
 * для каждого n > 1 составить программу нахождения произведения первых 10 членов
 * этой последовательности
 * 
 */

public class Task12 {
	
	public static void main(String[] args) {
		
		double p,a1,a;
		p = 1;
		a1 = 1;
		a = 6 + a1; //a2
		
		for (int i = 3; i <= 10; i++) {
			
			
			a = 6 + a;
			
			System.out.println( "a"+i+" = "+a);
			
		 p = p *a; 	
		 System.out.println(p);
		 
		 
		}
		System.out.println("произведение первых 10 членов последовательности равно = "+(p*a1*a));
		
}

	}