package by.htp.task.branching;
import java.util.Scanner;
/*
 * программа -льстец. на экране высвечивается вопрос "кто ты : мальчик или девочка"
 * введи д или м. в зависимости от ответа на экране должен появиться текст
 * "мне нравятся девочки" или "мне нравятся девочки"
 * 
 */

public class Task21 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        System.out.print("кто ты : мальчик или девочка\n");
        String n = in.nextLine();
          
        in.close(); 
        
        if (n.equals("m")) {
        	System.out.println("мне нравятся девочки");
        	
        }
        else if (n.equals("д")) {
        	System.out.println("мне нравятся мальчики");
        	
        }
       
	}

}
