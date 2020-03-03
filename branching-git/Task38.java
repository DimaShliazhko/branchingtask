package by.htp.task.branching;

/*
 * вычислить значение функции
 * 
 * y = x*x   если 0 < = x <=3
 * y= 4      если x > 3 или x < 0
 */

public class Task38 {
	
	public static void main(String[] args) {
		
		double x,y;
		x = 1.5;
		
		if ( x > 3 || x < 0) {
			y = 4;
			
			
		}
		
		else {
			y = x*x;	
			
		}
		System.out.println("у= "+y);
	}
	

}
