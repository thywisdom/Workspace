package Looping;

import java.util.Scanner;

public class SumofN {

	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter the n number");
		 int n = scan.nextInt();
		 
		 int sum=0;
		 for(int i=0;i<=n;i++)
		 {
		    sum=sum+i;	 
		 }
		 
		 System.out.println(sum);

	}

}
