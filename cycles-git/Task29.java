package by.htp.task.cycles;

/*
 * 
 * даны 2 числа. определить цифры, входящие в запись как первого так и 
 * второго числа
 */

public class Task29 {
	
	public static void main(String[] args) {
		
		int a= 12345;
		int b = 890123;
		System.out.println("a= "+a+" b= "+b);
		int i  =  String.valueOf(Math.abs(a)).length();
		int j  =  String.valueOf(Math.abs(b)).length();
		for(int c = 1; c <=i; c++) {
			
			
								
			int b1 =b;
			 for (int v = 1 ; v <= j; v++ ) {
				  
				 System.out.println( "  (a % 10) = "+ (a % 10) );
				 System.out.println( "  (b1 % 10) = "+ (b1 % 10) );
					
				
				 if (  (a % 10) == (b1 % 10)  ) {
					 
					 System.out.println("чифра "+(a % 10)+" входит в состав 2 чисел");
				 }
				 b1 = (int) (b1 / 10);
				 System.out.println("b1 = "+b1);
				  
				 
			 }
			// System.out.println(" уменьшение n = "+);
			
			 a = (int) (a / 10);
			 System.out.println("a = "+a);
			
		}
		
	}

}
