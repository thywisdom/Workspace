package workoutjava;

import java.util.Scanner;

public class Largestoftwonumbers {

	public static void main(String[] args) {
	   Scanner scan=new Scanner(System.in);
	   System.out.println("Enter the a value");
	   int a=scan.nextInt();
	   System.out.println("Enter the b value");
	   int b=scan.nextInt();
	   if(a>b)
	   {
		   System.out.println("a is greater");
	   }
	   else
	   {
		   System.out.println("b is greater");
	   }
	   
	   scan.close();
	}

}
