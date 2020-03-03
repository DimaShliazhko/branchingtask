package by.htp.task.branching;

/*
 * 
 * даны 3 точки, определить будут ли они расположены на одной прямой
 */

public class Task29 {

	public static void main(String[] args) {
		int x1,y1,x2,y2,x3,y3;
		
		x1 = 1;
		y1 = 1;
		x2 = 2;
		y2 = 2;
		x3 = 3;
		y3 = 3;
		// составим уравнение прямой через две точки
	if (  ((x2 - x1) /  (x3 - x1 )) == ((y2 - y1) / (y3-y1)   )) {
		
		System.out.println("точки лежат на одной прямой");
	}
	else {
		System.out.println("точки не лежат на одной прямой");
	}
	}
	
		
}
