package by.htp.task.cycles;

/*
 *найдите наибольшую цифру данного натурального числа
 * 
 * 
 */

public class Task33 {
	
 public static void main(String[] args) {
	 
	 int a;
	 a = 1234371;
	 
	 int i  =  String.valueOf(Math.abs(a)).length();	
		
		System.out.println("количество цифр в числе "+i);
		
		int max = 0;
		for (int j = 1; j <= i ; j++) {
			if ( max < (a % 10  ) ) {
				max  = (a % 10 );
				
			}
			
			a = (int) a / 10;
			
		}
		System.out.println("max = "+max);
	
	 
}

}
