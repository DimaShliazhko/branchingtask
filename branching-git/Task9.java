package by.htp.task.branching;
/*
 * составьте программу , которая определит по трем введенным сторонам , 
 * является ли данный треугольник равностаронним
 * 
 */

public class Task9 {

public static void main(String[] args) {
	int a,b,c;
	a = 3;
	b = 3;
	c = 3;
	if ((a == b) && (b == c) && (a ==c) ) {
		System.out.println("треугольник равностаронний");
	}
	else {
		System.out.println("треугольник не является равностаронним");
	}
}
}
