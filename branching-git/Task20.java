package by.htp.task.branching;

/*
 * определить , делителем каких чисел a,b,c является число k 
 * 
 */

public class Task20 {
	
	public static void main(String[] args) {
		
		int a,b,c,k;
		a = 3;
		b = 27;
		c = 7;
		k = 3;
		
		if (a % k == 0) {
			System.out.println("число "+k+" является делителем для "+a);
			}
		if (b % k == 0) {
			System.out.println("число "+k+" является делителем для "+b);
			}
		if (c % k == 0) {
			System.out.println("число "+k+" является делителем для "+c);
			}
	}

}
