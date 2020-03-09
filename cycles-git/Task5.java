package by.htp.task.cycles;

/* с помощью оператора while напишите программу определения суммы всех нечетных чисел
 * в диапазоне от 1 до 99 включительно
 * 
 * 
 */

public class Task5 {
	
public static void main(String[] args) {
	int i,s;
	i = 1;
	s = 0;
	while (i <=99) {
		if (i % 2.0 != 0 ) {
			System.out.println(i);
			s = s+i; 
			
		}
		i++;
		
	}
	System.out.println("сумма= "+s);
}

}
