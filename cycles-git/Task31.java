package by.htp.task.cycles;


import java.util.Scanner;
import java.util.Random ;
/*
 * компьютер генерирует пять  чисел в диапазрне от 1 до 15 включительно.
 * человек пытается их угадать. программа должна выводить угаданные и не угаданные числа 
 * из тех что сгенерировала программа , а так же ошибочные числа пользователя.
 * 
 */

public class Task31 {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		int [] a  = new int[5];
		
		for (int i = 0; i < 5; i++) {
			
			a[i] = random.nextInt(14)+1;
			System.out.println(a[i]);
		}
		
	
		
		Scanner in = new Scanner(System.in);
		System.out.println("введите числа")	;
		
		int [] b = new int[5];
		
		for (int i = 0 ; i < 5; i++) {
			
			b[i] = in.nextInt();
			//System.out.println(b[i]);
		}
		   in.close();
		   
						   for (int i = 0; i < 5; i++) { ////выводим рандом
								
								
								System.out.print(a[i]+" ");
							}
						   System.out.println();
											   for (int i = 0; i < 5; i++) {  /// выводим введенные числа
													
													
													System.out.print(b[i]+" ");
												}
											   System.out.println();
        
											   
		 int k = 0; //счетчик отгаданных чисел
        for (int i = 0 ; i < 5; i++) {
        	
        	for (int j = 0 ; j < 5; j++) {
        		
        		if (a[i] == b[j]) {
        			System.out.println("Пользователь отгадал число "+a[i]);
        			
        			    k++;
        			    System.out.println("k = "+k);
        			    a[i] = 0;
        			    b[j] = 0;
        		 		}
        		
        			
        			
        		}
        	}
        for (int i = 0; i < 5; i++) { ////выводим рандом новый
        	System.out.print(a[i]+" ");
			
		}
	   System.out.println();
	   
	   for (int i = 0; i < 5; i++) { 
       	
			if (a[i] != 0)
			System.out.print(" не угадали числа " +a[i]);
		}
	   System.out.println();
	   
	   for (int i = 0; i < 5; i++) {  /// выводим введенные числа
			
		   if (b[i] != 0)
				System.out.print(" числа введены ошибочно " +b[i]);
			
		}
	   System.out.println();
	   
	   
        	
        	
        	
        }
       
        
		
	}


