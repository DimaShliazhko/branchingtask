package by.htp.task.cycles;


/*
 * составить программу для вычисления значения функции f(x) на отрезке [a,b] с шагом h
 * результат предоставить в виде таблицы, первый столбец которой - значения аргумента
 * второй - соответствующие значение функции
 * 
 * f(x) =x - sin(x)
 */
public class Task21 {
	
	public static void main(String[] args) {
		int a,b;
		
		a = -5;
		b = 5;
		double y,h;
		h = 0.5;
		System.out.println(" x     y ");
		for ( double i = a ;i <= b ; i = i + h ) {
			y = i - Math.sin(i);
			System.out.println(+i+"   "+y);
			
		}
	}

}
