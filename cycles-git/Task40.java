package by.htp.task.cycles;

/*
 * получить все числа не превышающие
 *  заданного числа N, которые делятся без остатка на все свои цифры
 * 
 */

public class Task40 {
	public static void main(String[] args) {
		int n = 999;
		for (int i = 1 ; i < n ; i++) {
			
			int k = 0;//счетчик
			int i1 = i;
			int d = String.valueOf(Math.abs(i1)).length();
			//System.out.println("длина числа"+d);
			
			for (int j =1 ; j <= d; j++) {
				
				//System.out.println("число "+i+" делиться без остатка на "+i1%10);
				
				if ( i1%10 != 0 && i % (i1%10) == 0) {
				k++;
				}
				i1 = (int) i1 /10; 
			}
		
			
			
			if ( k  == d) {
				
				System.out.println("число "+i+" делится без остатка на все свои цифры");
			}
			
			
		}
		
	}

}
