package by.htp.task.branching;

/*
 * даны два действительных числа не равных друг другу.
 * меньшее из этих двух чисел заменить половиной их суммы, а большее - их удвоенным произведением
 * 
 */

public class Task15 {
	
	public static void main(String[] args) {
		double a,b;
		a =  6.5;
		b = 3.5;
		
		if (a < b) {
			a = (a + b)/ 2;
			b = (a * b ) * 2;
			
		}
		else {
			b = (a + b)/ 2;
			a = (a * b ) * 2;
			
		}
		System.out.println("a = "+a+ " b= "+b );
			
	}

}
