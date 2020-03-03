package by.htp.task.branching;

import java.util.Scanner;

/*
 * составить программу реализующая эпизод применения компьютера
 * в книжном магазине. еомпьютер запрашивает стоимость книг, сумму денег,
 * внесенную покупателем, если сдачи не требуется, печатает на экране
 * "спасибо" , если денег внесено больше чем необходимо. то печатает  "возьмите сдачу" и 
 * указывает сумму сдачи, если денег недостаточно то сообщает об этом и указывает размер
 * недостающей суммы
 * 
 */

public class Task34 {
	
	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
        System.out.print("введите стоимость книг\n ");
        int sum = in.nextInt();
          
        System.out.printf("\nстоимость книг " + sum);
        
        System.out.print("\nвнесите сумму ");
        int pay = in.nextInt();
          
        System.out.printf("\nвнесено " + pay);
        in.close();
        if (sum == pay ) {
        	System.out.println("\nспасибо");
        }
        else if (sum < pay) {
        	System.out.println("\nвозьмите сдачу "+ (pay - sum));
        	
        }
        else if (sum > pay) {
        	System.out.println("\nнедостаточно средств. внесите еще "+ (sum - pay));
        	
        }
        
        
	}

}
