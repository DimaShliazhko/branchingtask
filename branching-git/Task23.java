package by.htp.task.branching;

import java.util.Scanner;

/*
 * 
 *  определить правильность даты, введенной с клавиатуры число - 1 до 31, месяц 1 до 12
 *  еесли введены некорректные данные , то сообщить об этом
 */

public class Task23 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        System.out.print("ведите номер дня недели\n");
        int n = in.nextInt();
        if ((n >= 1) && (n <=31 ) ) {
        	
        	System.out.println("день недели "+n);
        }
        else {
        	System.out.println("день недели введен не верно\n ");
        }
        System.out.print("ведите номер месяца\n");
        int m = in.nextInt();
        
if ((m >= 1) && (m <=12 ) ) {
        	
        	System.out.println("номер месяца\n "+m);
        }
        else {
        	System.out.println("номер месяца введен не верно ");
        }
        in.close(); 
        
		
	}

}
