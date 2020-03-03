package by.htp.task.branching;

/*
 * составить программу нахождения модкля выражения a*x*x + b*x + с 
 * при заданных значениях
 * a,b,c,x
 * 
 */
public class Task7 {
	
	public static void main(String[] args) {
		int a,b,c,x,y;
		
		a = 1;
		b = -2;
		c = 3;
		x = -1;
		 y = Math.abs( a*x*x + b*x + c);
		 System.out.println(y);
	}

}
