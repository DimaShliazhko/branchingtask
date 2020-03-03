package by.htp.task.branching;

/* 
 * вычислить значение функции
 * 
 *  y = -x*x*x + 9 при x <= 13
  y = -3 / (x + 1) при x > 13
*/

public class Task40 {
	
	public static void main(String[] args) {
		double x,y;
		x = 8;
		 if ( x <= 13 ) {
		y =  -Math.pow(x, 3) + 9;	 
		
			 
		 }
		 else {
			y=  -3 / (x +1);
			 
			 
		 }
		System.out.println("y= "+y);
	}



}
