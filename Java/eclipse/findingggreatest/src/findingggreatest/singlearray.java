package findingggreatest;

import java.util.Scanner;

public class singlearray {

	public static void main(String[] args) {
       
		int[] a=new int[5];
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			a[i]=scan.nextInt();	
		}
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);	
		}
		for(int i:a)//enchanced for loop
		{
			System.out.println(i);
		}
		
		
				


	}
}
