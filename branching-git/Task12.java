package by.htp.task.branching;
/*
 * дыны три действительных числа. возвести в квадрат те их них, значения которых
 * необрицательны и в 4 степень отрицательные
 * 
 */

public class Task12 {
	public static void main(String[] args) {
		
		double a,b,c;
		a = 4.5;
		b = -3.7;
		c = -5;
		
		if ( a >= 0 ) {
					
			p2 (a);
			}
		else  {
			p4 (a);
			
		}
								if (b >=  0) {
									p2 (b);
									
								}
								else  {
									p4 (b);
									
								}
		if (c >= 0) {
			p2 (c);
			
		}
		else {
			p4 (c);
			
		}
		
		
	}
	
	public static  void p2 (double x) {
	
	System.out.println(x*x);
		
	}
	
	public static  void p4 (double x) {
		
		System.out.println(x*x*x*x);
			
		}

}
