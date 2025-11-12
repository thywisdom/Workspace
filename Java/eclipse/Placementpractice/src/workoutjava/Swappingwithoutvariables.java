package workoutjava;

import java.util.Scanner;

public class Swappingwithoutvariables {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the a value");
		int a=scan.nextInt();
		System.out.println("Enter the b value");
		int b=scan.nextInt();
		System.out.println("Before swapping");
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		
		a=a*b;
		b=a/b;
		a=a/b;
		
		System.out.println("After  swapping");
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		scan.close();

	}

}
