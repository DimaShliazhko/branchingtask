package by.htp.task.branching;

/*
 * вычислите число и месяц в невисокостном году по номеру дня
 * 
 */

public class Task35 {
	
	
	public static void main(String[] args) {
	
		int y,d;
		d =  66;
		y = 365;
		
		if (  d  >= 0 && d <=31  ) {
			System.out.println("январь");
			System.out.println("день"+(d-0));
			
		}
		else if (  d  > 31 && d <= 59  ) {
			System.out.println("февраль");
			System.out.println("день"+(d-31));
		}

		else if (  d  > 59 && d <= 90  ) {
			System.out.println("март");
			System.out.println("день"+(d-59));
		}
		else if (  d  > 90 && d <= 120  ) {
			System.out.println("апрель");
			System.out.println("день"+(d-90));
		}
		else if (  d  > 120 && d <= 151  ) {
			System.out.println("май");
			System.out.println("день"+(d-120));
		}
		else if (  d  > 151 && d <= 181  ) {
			System.out.println("июнь");
			System.out.println("день"+(d-151));
		}
		else if (  d  > 181 && d <= 212  ) {
			System.out.println("июль");
			System.out.println("день"+(d-181));
		}
		else if  (  d  > 212 && d <= 243  ) {
			System.out.println("август");
			System.out.println("день"+(d-212));
		}
		else if  (  d  > 243 && d <= 273  ) {
			System.out.println("сентябрь");
			System.out.println("день"+(d-243));
		}
		else if (  d  > 273 && d <= 304  ) {
			System.out.println("октябрь");
			System.out.println("день"+(d-273));
		}
		else if (  d  > 304 && d <= 334  ) {
			System.out.println("ноябрь");
			System.out.println("день"+(d-304));
		}
		else if (  d  > 334 && d <= 365  ) {
			System.out.println("декабрь");
			System.out.println("день"+(d-334));
		}

	}
	}
