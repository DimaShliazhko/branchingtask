package by.htp.task.branching;


/*
 * перераспределить значения переменных x,y так, чтобы в x оказалось большее из этих
 * значений , а в y - меньшее
 * 
 */
public class Task22 {

	public static void main(String[] args) {
		int x,y,z;
		x = 6;
		y = 8;
		System.out.println("x = "+x+" y= "+y);
		if (x < y) {
			z = x;
			x = y;
			y = z;
			System.out.println("перераспределение "+"x = "+x+" y= "+y);
		}
		else {
			System.out.println("перераспределения нет");
		}
		
		
	}
	
}
