package by.htp.task.branching;

/*
 * 
 * подсчитать количество положительных среди чисел a,b,c
 */

public class Task19 {
	
	public static void main(String[] args) {
		int a,b,c;
		a = -3;
		b = 4;
		c = -4;
		
		if (a > 0 && b > 0 && c > 0    ) {
			System.out.println("положительных числа 3 ");
		}
		else if ((a < 0 && b < 0 && c < 0    )) {
			System.out.println("положительных чисел нет ");
			
		}
		else if ( (a > 0 && b > 0) || (a > 0 && c > 0) || (b > 0 && c > 0) ) {
			System.out.println("трицательных чисел 2 ");
		}
		else if ( (a < 0 && b < 0) || (a < 0 && c < 0) || (b < 0 && c < 0) ) {
			System.out.println("трицательных чисел 1 ");
		}
	}


}
