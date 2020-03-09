package by.htp.task.cycles;

/*
 * составьте таблицу значений функции y = 5 - x*x / 2 на отрезке [-5,5]
 *  с шагом 0.5
 */

public class Task13 {
	
	public static void main(String[] args) {
		
		double a,b,x,y,h;
		a = -5;
		b = 5;
		h = 0.5;
		
		
		for ( x =  a ; x <= b; x = x+h ) {
			
			y = 5 - (x*x) / 2;
			System.out.println("x= "+x+" y= "+y);
			
			
		}
		
		
	}

}
