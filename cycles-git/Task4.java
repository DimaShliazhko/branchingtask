package by.htp.task.cycles;

/* с помощью оператора while напишите программу вывода всех
 * нечетных чисел в диапазоне от 2 до 100 включительно
 * 
 * 
 */

public class Task4 {
	public static void main(String[] args) {
		
		int i;
		i=2;
		while ( i <=100) {
			
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
		
	}

}
