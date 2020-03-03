package by.htp.task.branching;


/* 
 * вычислить значение функции
 * 
 *  y = -x*x + x - 9 при x >= 8
  y = 1 / (x*x*x*x - 6) при x < 8
*/


public class Task39 {
	 
	public static void main(String[] args) {
			double x,y;
			x = 8;
			 if ( x >= 8 ) {
			y = -x*x + x - 9;	 
			
				 
			 }
			 else {
				y=  1 / (Math.pow(x, 4) - 6);
				 
				 
			 }
			System.out.println("y= "+y);
		}


}
