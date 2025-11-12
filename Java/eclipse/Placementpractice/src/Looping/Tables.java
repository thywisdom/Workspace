 package Looping;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the a value ");
		int a=scan.nextInt();
		System.out.println("enter the n value ");
		int num=scan.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			
			{
				System.out.println(num + "x"+i+ "=" + (i*a));
			}
			
			
		}
        
	}

}
