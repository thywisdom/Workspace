package Looping;

import java.util.Scanner;

public class FirstLastNumberSum {

	public static void main(String[] args) {
		/*Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number serires");
		long number=scan.nextLong();
		System.out.println("Enter the first digit: ");
		int Firstdigit=scan.nextInt();
		System.out.println("Enter the first digit: ");
		int Lastdigit=scan.nextInt();
		int sum=0;
		int Sum=Firstdigit+Lastdigit;
		System.out.println(Sum);*/
//Using For loop;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number serires");
		long numbers=scan.nextLong();
		
		int lastdigit=(int) (numbers % 10);
		System.out.println("Lastdigit: " + lastdigit);
		
		int firstdigit=0;
		for(long n=numbers;numbers>0;numbers/=10)
		{
			firstdigit=(int) (numbers%10);
		}
	
		System.out.println("Firstdigit: " + firstdigit);
		int sum=firstdigit+lastdigit;
		System.out.println(sum);
		
	}

}
