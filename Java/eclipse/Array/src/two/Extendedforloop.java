package two;

import java.util.Scanner;

public class Extendedforloop {

	public static void main(String[] args) {
		int[] [] a=new int[3][3];
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the matrix");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=scan.nextInt();
			}
		}
		
		for(int[] b:a)
		{
			for(int i:b)
			{
				System.out.print(i);
			}
			System.out.println();
		}


	}

}
