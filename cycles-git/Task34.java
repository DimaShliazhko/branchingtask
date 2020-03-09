package by.htp.task.cycles;

/*
 * 
 * найдите все четырехзначные чифры, сумма цифр каждого из которых равна 15
 */

public class Task34 {
	
	public static void main(String[] args) {
		
		int a,b,c,d ;
		//a = b = c = d = 0;
		
		for (a = 0; a <= 9 ; a++) {
				
			for (b = 0; b <= 9 ; b++) {
				
				for (c = 0; c <= 9 ; c++) {
					
					for (d = 0; d <= 9 ; d++) {
						if (a+b+c+d == 15) {
							System.out.println("сумма цифр числа "+a+b+c+d+" равна 15");
							
						}
						
					}
					
				} 
				
			}
			
			
			
		}
		
	}

}
