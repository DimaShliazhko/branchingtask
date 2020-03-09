package by.htp.task.cycles;


/*
 * написать программу переводящая римские цифры в арабские
 * 
 *  I = 1; V = 5; X = 10; L = 50; C = 100; D = 500; M = 1000.
 * 
 */
public class Task30 {
	
	public static void main(String[] args) {
		
		
		String s = "CXC";
		int sum = 0;
		
		int number = 0;
		
		for ( int i = 0; i < s.length(); i++) 
		{
			char arr  = s.charAt(i);
			//System.out.println(" arr = "+arr);
			int last = number;// вводим переменную для контроля цифр IV =  4; IX = 9; XL =  40; XC = 90;
			System.out.println("last "+last);
			 number = letterToNumber( arr );	
			System.out.println("number "+number);
			
			if (last < number)
				{int number1= number - last;
				System.out.println(+last);
				System.out.println("number - last "+(number1 ));
				sum =  sum + number1 - last;
				last = 0;
				//
				}
			else {
				last = 0;
				sum = sum + number;
			}
			System.out.println("sum = "+sum);
			}
			 //System.out.println(" sum= "+sum);
		}
		
		
		
	
		
	private static int letterToNumber(char letter)
	{
 
		switch (letter) {
			case 'I':  return 1;
			case 'V':  return 5;
 
			case 'X':  return 10;
			case 'L':  return 50;
			case 'C':  return 100;
			case 'D':  return 500;
			case 'M':  return 1000;
			default:   return 0;
		}
			}
}
	
	
		
	


