package findingggreatest;

import java.util.Scanner;

public class eveninoutput {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter array size");
		int i=scan.nextInt();
		int[] a=new int[i];
		for(int n=0;n<i;n++)
		{
			a[n]=scan.nextInt();
			if(a[n]%2==0)
			{
				System.out.println(a[n]);
			}
		}
		
	}

}
