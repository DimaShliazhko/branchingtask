package by.htp.task.branching;
import static java.lang.Math.pow;

/*
 * даны две точки , составить алгоритм, определяющий ,
 *  которая точка находитьяс ближе к началу координат
 * 
 */

public class Task13 {

	
public static void main(String[] args) {
	int x1,x2,y1,y2;
	double d1,d2;
	x1 = 1;
	y1 = 1;
	
	x2 = 5;
	y2 = 5;
	
	d1 = Math.sqrt( pow(x1-0,2) + pow (y1-0,2) );
	
	d2 = Math.sqrt( pow(x2-0,2) + pow (y2-0,2) );
	if (d1 > d2) {
		System.out.println("точка x2,y2 нахидиться ближе к центру координат");
	}
	else {
			
			System.out.println("точка x1,y1 нахидиться ближе к центру координат");
			
		}
	}
}
