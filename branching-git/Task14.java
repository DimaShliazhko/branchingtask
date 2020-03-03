package by.htp.task.branching;

/*
 * даны два угла треугольника (в градусах )
 * определить , существует ли такой треугольник, и если да, то будет 
 * ли он прямоугольным 
 */

public class Task14 {

public static void main(String[] args) {
	int a,b,c;
	a = 30;
	b = 60;
	
	if (a+b < 180) {
		System.out.println("треугольник существует ");
		if (a == 90 || b == 90 || 180 - a -b == 90) {
			System.out.println("треугольник прямоугольный ");
			
		}
		
	}
	else {
		System.out.println("треугольник  не существует ");
		
	}
			
}
}
