package Practicing;

import java.util.Scanner;

public class Calculater {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the a value");
		int a=scan.nextInt();
		System.out.println("Enter the b value");
		int b=scan.nextInt();
		System.out.println("Enter the operator");
		int operator=scan.nextInt();
		
		switch (operator)
		{
		case 1:System.out.println(a+b);
		break;
		case 2:System.out.println(a-b);
		break;
		case 3:System.out.println(a*b);
		break;
		case 4:System.out.println(a/b);
		break;
		case 5:System.out.println(a%b);
		break;
		default:System.out.println("Invalid");
		
		} 
	}

}
