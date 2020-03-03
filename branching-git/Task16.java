package by.htp.task.branching;
/*
 * 
 * на плоскости XOY задана своими координатами точка А. указать , где 
 * она расположена (на какой оси или в каком координатном угле) 
 */

public class Task16 {
	
	public static void main(String[] args) {
		int x,y;
		x = 1;
		y = -4;
		
		if (x > 0 && y > 0) {
			System.out.println("кординатная плоскость 1");
			
		}
		else if (x < 0 && y > 0) {
			System.out.println("кординатная плоскость 2");
			
		}
		else if (x < 0 && y < 0) {
			System.out.println("кординатная плоскость 3");
			
		}
		else if (x > 0 && y < 0) {
			System.out.println("кординатная плоскость 4");
			
		}
	}

}
