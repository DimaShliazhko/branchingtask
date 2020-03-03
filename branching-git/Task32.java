package by.htp.task.branching;

/*
 * написать программу которая по заданым трем числам определяет являетсяли сумма
 * каких либо двух из них положительной
 * 
 */

public class Task32 {
	
	public static void main(String[] args) {
		
		int a,b,c;
		a = -4;
		b = -6;
		c= -7;
		
		if (  a+b > 0  ) {
			System.out.println("сумма a + b - положительная");			
		}
		else if ( a+c > 0) {
			System.out.println("сумма a + с - положительная");	
		}
		else if ( b +c > 0) {
			System.out.println("сумма b + с - положительная");	
		}
		else {
			System.out.println("два числа не образуют положительную сумму");	
		}
	}
	

}
