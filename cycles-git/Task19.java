package by.htp.task.cycles;

/*
 * даны числовой ряд и некоторое число e . найти сумму тех членов ряда, модуль которых
 * больше или равен заданному e. общий член ряда имее вид
 * 
 * a(n) = 1  + 1
 *        -    -
         2^n	3^n
 
 */

public class Task19 {
	
public static void main(String[] args) {
		
		int n;
		n = 5;
		double e = 0.02;
		double s,a;
		s = 0;
		System.out.println("e= "+e);
		for (int i = 1 ; i <=n ; i++ ) {
			
			a = (1 / Math.pow(2,i) ) +  (1.0 /  Math.pow(3,i))  ;
			System.out.println("a"+i+" = "+a);
			System.out.println("модуль = "+ Math.abs(a) );
			
			if (   Math.abs(a)   >= e )
				s = s + a;
			System.out.println("S = "+s);
			}
		
	}
	

}
