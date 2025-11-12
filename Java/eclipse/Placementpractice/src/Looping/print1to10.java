package Looping;

import java.util.Scanner;

public class print1to10 {

	public static void main(String[] args) 
	{
		
		/*for(int i=1;i<=10; i++) {
			System.out.println(i);
		}*/
		/*int sum=0;       
		for(int n=1;n<=4;n++)
		{
			sum=sum+n;
			
		
		}
		
		System.out.println(sum);*/
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the n value");
		int n=scan.nextInt();
		
		
		/*for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}*/
		/*for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=m; j++)
			{
				if(i == 1 || j == 1 || i == n || j == m)
				{
					System.out.print("*");
					
				}
				else
				{
					System.out.print(" ");
				}
				System.out.println();
			}
			
		}*/
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=1; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

	