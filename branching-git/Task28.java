package by.htp.task.branching;
/*
 * данф три числа a,b,c  определить какое из них равно d. если ни одно не равно d  то 
 * найти max (d - a, d-b , d -c)
 * 
 */

public class Task28 {
	
	public static void main(String[] args) {
		int a,b,c,d,max,max1;
		a = 3;
		b = 2;
		c = 6;
		d = 5;
		//max = 0;
		
		if (a == d || b == d || c == d) {
		
		if (a == d) {
			System.out.println("a=d");
			
		} else if (b == d) {
			System.out.println("b=d");
			
		} else if (c == d) {
			System.out.println("c=d");
			
		}
		}
		else {
			if ( d- a > d- b){
		
			
			max = d-a;
			
			}	else {
				
				max = d-b;	
				
			}
			if (max > d- c) {
				
				
			}
			else {
				max = d- c;
			}
			System.out.println(max);
		}
		
	}

}
