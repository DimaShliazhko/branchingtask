package by.htp.task.cycles;

/*
 * даны действительное a и натуральное n . вычислить a(a+1)...(a+n-1)
 */

public class Task17 {
	
	public static void main(String[] args) {
		
		
		int n;
		double a,p;
		a = 2;
		n = 5;
		
		p = 1;
		for (  int i = 1; i <= n; i++ ) {
			
			p = p *(a+(i - 1));
			
		}
		System.out.println("p = "+p);
	}

}
