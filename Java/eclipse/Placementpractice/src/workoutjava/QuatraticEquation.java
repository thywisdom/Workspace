package workoutjava;

import java.util.Scanner;

public class QuatraticEquation {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the a value");
		int a= scan.nextInt();
		System.out.println("Enter the b value");
		int b= scan.nextInt();
		System.out.println("Enter the c value");
		int c= scan.nextInt();
		System.out.println("Enter the x value");
		int x= scan.nextInt();
		System.out.println(a*x*x+b*x+c);
	}
	

}
