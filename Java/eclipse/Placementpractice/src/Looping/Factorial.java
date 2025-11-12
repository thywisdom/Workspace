package Looping;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the n value");
		int n=scan.nextInt();
		
		long product=1;
		for(int i=1;i<=n;i++)
		{
			product=product*i;
		}
		System.out.println(product);

	}

}
