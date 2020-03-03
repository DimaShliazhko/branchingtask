package by.htp.task.branching;

/*
 * составить программу, определяющую результат гадания на ромашке - "любит - не любит"
 * взяв за исходное данное количество лепестков n
 * 
 */

public class Task24 {
	
	public static void main(String[] args) {
		int n = 15;
		if ( n  % 2 == 0) {
			System.out.println("не любит");
			
		}
		else {
			System.out.println("любит");
		}
	}

}
