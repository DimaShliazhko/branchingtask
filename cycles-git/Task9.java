package by.htp.task.cycles;
/*
 * найдите сумму квадратов первых ста чисел
 * 
 */

public class Task9 {
	public static void main(String[] args) {
		
		int sum;
		sum = 0;
		for (int i = 0; i <=100;i++) {
			
			sum = sum + i*i;
			
			}
		System.out.println("сумма равна = "+sum);
	}

}
