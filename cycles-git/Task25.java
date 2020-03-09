package by.htp.task.cycles;

import java.util.Scanner;


/*
 * требуется определить факториал числа, которое ввел пользователь
 * 
 */

public class Task25 {
	
	
	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
        System.out.print("введите целое число:\n ");
        
        int n = in.nextInt();
        double f;
        f= 1;
        
       
        in.close();
        
        for( int i = 1; i <= n; i++ ) {
        	
        	f = f*i;
     	
        }
        System.out.println("факториал числа "+n+" равен "+f);
	}

}
