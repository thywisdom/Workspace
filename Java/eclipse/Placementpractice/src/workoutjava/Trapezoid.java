package workoutjava;

import java.util.Scanner;

public class Trapezoid {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the values");
		int b1=scan.nextInt();
		int b2=scan.nextInt();
		int h=scan.nextInt();
		System.out.println(0.5*(b1+b2)*h);

	}

}
