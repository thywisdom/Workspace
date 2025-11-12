package findingggreatest;

import java.util.Scanner;

public class checkingnumbers {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter array size");
		int i=scan.nextInt();
		int[] a=new int[i];
		
		for(int n=0;n<i;n++)
		{
			a[n]=scan.nextInt();
		
			
		}
		System.out.println("enter search");
		int b=scan.nextInt();
		for(int n=0;n<i;n++)
		{
			if(a[n]==b)
			{
				System.out.println("present");
			}
		}

	}

}
