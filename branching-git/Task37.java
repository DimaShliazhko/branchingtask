package by.htp.task.branching;

/*
 * 
 * вычислить значение функции
 * 
 *  y = -x*x+3*x+9 при x >=3
  y = 1 / (x*x*x* - 6) при x < 3
*/


public class Task37 {
	
	public static void main(String[] args) {
		double x,y;
		x = 3;
		 if ( x >=3 ) {
		y = -x*x+3*x+9;	 
		
			 
		 }
		 else {
			y=  1 / (Math.pow(x, 3) - 6);
			 
			 
		 }
		System.out.println("y= "+y);
	}

}
