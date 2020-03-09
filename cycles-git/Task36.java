package by.htp.task.cycles;

/* два двузначных числа , записанны одно за другим, образуют четырехзначное 
 * число, которое делится на их произведение
 * найти эти числа
 */

public class Task36 {

	public static void main(String[] args) {
		int a;
		int b;
		
		for ( a = 10 ; a <= 99 ; a++) {
			
			for (b = 1; b <= 99; b++) {
				
				if ( ((a * 100) + b ) % (a*b) == 0 )
				
				System.out.println(+((a * 100) + b ));
			}
			
			
		}
	}
}
