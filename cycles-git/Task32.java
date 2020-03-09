package by.htp.task.cycles;

/*
 * проверить введенную пользователем строку на наличие недопустимых символов
 * в качестве первого символа допустимы только буквы и знак поддчеркивания.
 * остальные символы могут быть буквами , цифрами и знаком подчеркивания
 * 
 */

public class Task32 {
	
	public static void main(String[] args) {
		
		String st = "1qwq11";
		char[] arrch = st.toCharArray();
		
		/*int a  = 49;
		char s  = (char) a;
		*/
		
	/*	char s  = '1';
		int a  = (int) s;
		System.out.println(a);
		*/
		for (int i = 0 ; i < 10 ;i++) {
			
			
			
			if ( (int) arrch[0] == 48 + i  || arrch[0] == '_'    ) {
				
				System.out.println("недопустимый символ");
				break;
			}
			else {
				System.out.println("строка допустима");
				break;
			}
			
		}
		
	}

}
