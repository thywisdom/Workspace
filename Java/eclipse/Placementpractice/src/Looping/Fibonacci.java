package Looping;

import java.util.Scanner;

public class Fibonacci {
 
	public static void main(String[] args) {
		
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter a sequence of number you want to print: ");
				int n = sc.nextInt();
				int a = 0,b =1,c;
				
				System.out.println("The fibonacci series for the number " +n+ " is ");
				 
				for(int i = 0; i <= n; i ++) 
				{
		          System.out.print(a+ " ");
		          c = a+b;
		          a =b;
		          b = c;
			}
				sc.close();
   
		}
}

	


