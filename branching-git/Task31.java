package by.htp.task.branching;
/*
 * 
 * заданы размеры a,b прямоугольного отверстия и рамеры x,y,z кирпича. определить 
 * пройдет ли кирпич через отверстие
 */

public class Task31 {
	
	public static void main(String[] args) {
		
		int a,b,x,y,z;
		
		a = 20;
		b = 15;
		x = 15;
		y= 25;
		z = 20;
		
		
		if (( x <= a && y <= b) ||  ( x <= b && y <= a  )  || ( z <= a && y <= b) ||  ( z <= b && y <= a  ) || ( x <= a && z <= b) ||  ( x <= b && z <= a  )  )   {
			System.out.println("кирпич пройдет");
			
		}
		else {
			System.out.println("кирпич  не пройдет");
		}
	}

}
