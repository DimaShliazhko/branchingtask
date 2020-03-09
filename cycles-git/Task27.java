package by.htp.task.cycles;

import java.util.Scanner;

/*
 * для каждого натурального числа в промежутке от m до n вывести все делители, кроме
 * единицы и самого числа , m и n вводятся с клавиатуры
 * 
 */

public class Task27 {
	
	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
        System.out.print("введите натуральное число m\n ");
        
        int m = in.nextInt();
        System.out.println("m = "+m);
        
        System.out.print("введите натуральное число n\n ");
        
        int n = in.nextInt();
        System.out.println("n = "+n);
       
        
        int i;
        
        for (  i = m; i <= n; i++ ) {
		
        	for (int j = 2 ; j < i; j++) {
        		if (  i % j == 0  ) {
        			System.out.println("делитель для числа "+i+" =  "+j);
        		
        		}
        	
			}
        }
        in.close();
        
	}

}
