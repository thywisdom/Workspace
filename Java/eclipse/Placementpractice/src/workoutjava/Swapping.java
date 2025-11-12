package workoutjava;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the a value");
		int a=scan.nextInt();
		System.out.println("Enter the b value");
		int b=scan.nextInt();
		System.out.println("Before the swapping");
		System.out.println("a=" + a);
		System.out.println("b=" + b); 
		int temp=a;
		a=b;
		b= temp;
		
		System.out.println("After the swapping");
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		scan.close();
		
	}

}
