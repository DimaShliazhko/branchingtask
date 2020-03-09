package by.htp.task.cycles;

/*
 * для заданного натурального числа определить 
 * образуют ли его цифры аррифметическую прогрессию
 * предпологается что в числе не менее трех цифр
 * например 1357, 963
 * 
 */

public class Task38 {
	
	public static void main(String[] args) {
		
		int a = 1357;
		int i  =  String.valueOf(Math.abs(a)).length();	
		int k= 0; //счетчик
		
for (  int j =1; j <= i ; j++) {
		
	if ( (a % 10) - (( int ) a / 10) % 10 == (( int ) a / 10) % 10 - (( int ) a / 100) % 10   ) {
				
		k++;		
		//System.out.println(" прогрессия ");
				
			}
	
	a = ( int ) a / 10;
	}
					if ( k == i-2) { // проверка это все числа образуют последовательность
						
						System.out.println(" все числа образуют прогрессию ");
						
					}
					else {
						System.out.println(" все числа не образуют прогрессию ");
					}
	
}

}
