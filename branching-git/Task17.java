package by.htp.task.branching;

/*
 * даны целые цисла m и n . если числа не равны , то заменить
 *  каждое из них одним и темже числом равным большему из исходных, 
 *  а если равны то заменить часла нулями
 * 
 */

public class Task17 {
	
	public static void main(String[] args) {
		int n,m;
		n = 4;
		m = 4;
		if (n != m ) {
			if (n > m) {
				m = n;
				}
			else {
				n = m;
			}
			
		}
		else {
			n = 0;
			m = 0;
		}
		System.out.println("m = "+m+" n= "+n);
	}
	

}
