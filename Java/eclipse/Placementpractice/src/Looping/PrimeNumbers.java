package Looping;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
	
		/*Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=scan.nextInt();
		int count=0;
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
			
		}
		if (count==2)
		{
			System.out.println(n + " is a prime number");
		}
		else
		{
			System.out.println(n + " is not a prime number");
		}*/
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=scan.nextInt();
		for(int i=2;i<=n;i++) {
			boolean isPrime=true;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				System.out.print(i+" ");
			}
			
		}
		
		
		
		
	}


	}


