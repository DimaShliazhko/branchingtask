package by.htp.task.branching;

/*
 * Даны действительные числа a,b,c. удвоить эти числа , если a>b>c  и заменить их 
 * абсолютными значениями если это не так
 * 
 */

public class Task30 {
	
	public static void main(String[] args) {
		double a,b,c;
		a = 7.5;
		b = -1.5;
		c = -6.5;
		
		if (a > b) {
			if ( b > c) {
				a = a*2;
				b = b*2;
				c = c*2;
				//System.out.println("a "+a+" b= "+b+" c = "+c);
			}
			else {
				a = Math.abs(a);
				b = Math.abs(b);
				c = Math.abs(c);
				
			}
		
			System.out.println("a "+a+" b= "+b+" c = "+c);	
		}
		else {
			a = Math.abs(a);
			b = Math.abs(b);
			c = Math.abs(c);
			System.out.println("a "+a+" b= "+b+" c = "+c);
		}
		
	}

}
