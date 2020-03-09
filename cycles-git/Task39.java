package by.htp.task.cycles;
/*
 * в трехзначном числе зачеркнули старшую цифру.
 * когда полученное число умножили на 7 
 * то получили исходное число.
 * найти это число
 * 
 */
public class Task39 {
	
	public static void main(String[] args) {
		
		
		for (int  i =100 ; i <= 999; i++ ) {
			
			
			int  i1 =  i % 100;
			//System.out.println(+i1);
			if ( i1 * 7 == i ) {
				System.out.println("это число "+ i);
			}
			
		}
	
					
					
			}
			
			
			
		}
	


