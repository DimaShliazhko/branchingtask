package by.htp.task.cycles;
import java.util.Scanner;
/*
 * 
 * вводится натуральное число. найти сумму четных цифр входящих в его состав
 * преобразовать его в другое число, цифры которого будут следовать в обратном порядке по сравнению с 
 * введенным числом
 * 
 */

public class Task24 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        System.out.print("введите целое число:\n ");
        int s;
        s = 0;
        int n = in.nextInt();
       double n1;
        n1 = 0;
        in.close();
		 
		
		int i  =  String.valueOf(Math.abs(n)).length();	
		
		System.out.println("количество цифр в числе "+i);
		
		for (  int a =1; a <= i ; a++) {
			
			if ( n % 2 == 0) {
				
				
				s = s + (n % 10);
				System.out.println("s = "+s);
			}
			
			System.out.println( "  (n % 10) = "+ (n % 10) );
			
			System.out.println("Math.abs(a - (i+1)) = "+Math.abs(a - i));
			
			 n1 =  (n1 + (n % 10) * Math.pow( 10     ,    Math.abs(a - i)   ));
			 System.out.println("число наоборот ="+n1);
			
			 n = (int) (n / 10);
			 System.out.println(" уменьшение n = "+n);
			 
			
		}
	
	}
}
