package by.htp.task.cycles;

/*
 * составьте программму нахождения произведения квадратов
 * первых двухсот чисел
 *  
 */

public class Task10 {

	public static void main(String[] args) {

		double prod;
		prod = 1;
		
		for (int i = 1 ; i <= 200; i++) {
			System.out.println(i);
			prod = 	prod * i * i;
			System.out.println("произведение квадратов равно "+ prod);
		} 
		System.out.println("произведение квадратов равно "+ prod);
	}
}
