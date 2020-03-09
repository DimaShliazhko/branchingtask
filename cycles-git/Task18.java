package by.htp.task.cycles;

/* даны числовой ряд и некоторое число e. 
 * найти сумм тех членов ряда, модуль которых больше 
 * или равен заданному e. общий член ряда имее вид
 * 
 * 
 * a(n) = (-1)n-1	
 * 		  ------	
 *			n 
 */

public class Task18 {
	
	public static void main(String[] args) {
		
		int n;
		n = 5;
		double e = 0.05;
		double s,a;
		s = 0;
		System.out.println("e= "+e);
		for (int i = 1 ; i <=n ; i++ ) {
			
			a = (Math.pow(-1, i-1)) / i;
			System.out.println("a"+i+" = "+a);
			System.out.println("модуль = "+ Math.abs(a) );
			
			if (   Math.abs(a)   >= e )
				s = s + a;
			System.out.println("S = "+s);
			}
		
	}
	

}
