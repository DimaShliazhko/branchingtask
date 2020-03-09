package by.htp.task.cycles;
/*
 * вычислите значение функции на отрезке [a,b] c шагом h
 * 
 * 
 * 
 */

public class Task7 {
	
	public static void main(String[] args) {
		
		int a,b,x,y,h;
		a = -10;
		b = 10;
		h = 2;
		//x = a;
		
		while (a <= b) {
			x = a;
			if (x > 2) {
				
				y = x;
				System.out.println("x= "+x+" y= "+y );
				
			}
			else  {
				y = -x;
				System.out.println("x= "+x+" y= "+y );
			}
			a = a+h;
			
		}
		
		
		
	}

}
