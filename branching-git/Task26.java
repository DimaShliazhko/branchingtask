package by.htp.task.branching;

/*
 * 
 * написать программу нахождения суммы меньшего и большего из трех чисел
 */

public class Task26 {
	
	public static void main(String[] args) {
		int a,b,c,max, min,s;
		a = 3;
		b = 4;
		c = 2;
		max = 0;
		min = 0;
		
		
		if (a > b && a > c ) {
			
			System.out.println("максимальное число a "+a);
			max = a;
		}
		else if (b > c && b > a) {

			System.out.println("максимальное число b "+b);
			max = b;
		}
		else if (c > a && c > b) {

			System.out.println("максимальное число c "+c);
			max =c;
		}
		
		if (a < b && a < c ) {
			
			System.out.println("минимальное число a "+a);
			min = a;
		}
		else if (b < c && b < a) {

			System.out.println("минимальное число b "+b);
			min = b;
		}
		else if (c < a && c < b) {

			System.out.println("минимальное число c "+c);
			min =c;
		}
		s = max + min;
		System.out.println("сумма минимального и максимального числа равна "+s);
		

		
}
}