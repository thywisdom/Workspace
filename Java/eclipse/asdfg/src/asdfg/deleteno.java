package asdfg;

import java.util.Scanner;

public class deleteno {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int [] a=new int[6];
		System.out.println("enter array");
		for(int i=0;i<5;i++)
		{
		        a[i]=scan.nextInt();
		}
		//12 5 6 7 8
		//0  1 2 3 4 5
		System.out.println("enter no");
		int b=scan.nextInt();//15
		System.out.println("enter position");
		int c=scan.nextInt();//2
		//12 5 15 6 7 8
		for(int i=5;i<c;i++)//5>2;4>2;3>2;2>2
		{
			a[i]=a[i+1];
			//4     3
		}
		a[c]=b;
		for(int n:a)
		{
			System.out.println(n);
		}
	}




	}


