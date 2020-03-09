package by.htp.task.cycles;

/*
 * найдите количество четных числ данного натурального числа
 * 
 * 
 */

public class Task35 {
	
	public static void main(String[] args) {
		
		
		long a =  128456;
		int i  =  String.valueOf(Math.abs(a)).length();	
		int k = 0; 
		
		for (  int j =1; j <= i ; j++) {
			
			 long c = a % 10;
			if ( c % 2 == 0 )
				{ k++;
				
				}
			a = ( int ) a / 10;
			
				}
		System.out.println( " количество четных чисел в числе "+k );
			
		}
		
	}


