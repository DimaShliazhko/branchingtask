package by.htp.task.cycles;

import java.util.Scanner;

/*
 * написать программу, в которой вводятся два операнда X  и Y
 * и знак операции (+,-,/,*) вычислить
 * результат Z в зависимости от знака. Предусмотреть реакции на
 * возможный неверный знак операции, а так же на ввод Y = 0, при делении.
 * организовать возможность многократных вычислений без перегрузки программы
 * (т.е. построить цикл) в качестве символа прекращения вычислений принять 0
 * 
 */

public class Task28 {

	
	public static void main(String[] args) {
		
		int exit = 1;
		
		while ( exit  != 0) {
		
		Scanner in = new Scanner(System.in);
        System.out.print("введите X\n ");
        
        double x = in.nextDouble();
        System.out.println(" X ="+x);
        
        System.out.print("введите Y\n ");
        double y = in.nextDouble();
        System.out.println(" Y ="+y);
        
     
        System.out.println("Введите операнд (+,-,/,*)\n ");
        
        String  o = in.next();
        
        
        if (o.equals("*") || o.equals("/")||o.equals("+") || o.equals("-")  ) {
        	System.out.println("операнд введен  верно");
        	System.out.println("Операнд равен = "+o);
        }
        
        else {
        	
        	System.out.println("операнд введен не верно");
        	break;
        }
    
        if ( o.equals("/") && y == 0 ) {
        	System.out.println("деление на 0 запрещено");
        	break;
        	
        }
        
        
        double z = 0;
        
        switch (  o ) {
        case "*" : 
        	z = x*y;
        	break;
        case "/" :
        	z = x / y;
        	break;
        case "+" :
        	z = x + y;
        	break;
        case "-" :
        	z = x - y;
        	break;
        	
        }
        System.out.println("z = "+z);
       
        
        
        System.out.println(" что бы закончить программу введите 0");
        
       exit = in.nextInt();
       
       // in.close();
		}
		System.out.println("выполнение программы закончено");
		
		
		
	}
		
		
	}

