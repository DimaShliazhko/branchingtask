package by.htp.task.branching;

/*
 * 
 * найти max{min(a,b),min(c,d)}
 */

public class Task27 {
	
	public static void main(String[] args) {
		int a,b,c,d,min1,min2;
		a = 3;
		b = 4;
		c = 2;
		d = 1;
		
		
		if (a < b) {
			min1 = a;
			}
		else {
			min1 = b ;
		}
		
		if (c < d) {
			min2  = c;
			
		}
		else {
			min2 = d;
		}
		if (min1 < min2) {
			System.out.println(min2);
		}
		else {
			System.out.println(min1);
			
		}
	}

}
