package by.htp.task.cycles;

/*
 *  вычислите значение функции на отрезке [a,b] c шагом h
 * 
 */

public class Task8 {
public static void main(String[] args) {
		
		int a,b,x,y,h,c;
		a = -20;
		b = 25;
		h = 5;
		c = 2;
		//x = a;
		
		while (a <= b) {
			x = a;
			if (x != 15) {
				
				y = (x + c) * 2;
				System.out.println("x= "+x+" y= "+y );
				
			}
			else  {
				y = (x - c ) + 6;
				System.out.println("x= "+x+" y= "+y );
			}
			a = a+h;
			
		}
		
		
		
	}



}
