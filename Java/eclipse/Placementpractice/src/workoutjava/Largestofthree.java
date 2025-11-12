package workoutjava;

import java.util.Scanner;

public class Largestofthree {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the a values");
	    int a=scan.nextInt();
	    System.out.println("Enter the b values");
	    int b=scan.nextInt();
	    System.out.println("Enter the c values");
	    int c=scan.nextInt();
	    
	    if(a>b && a>c)
	    {
	    	System.out.println("a is greater");
	    }
	    else if(b>a && b>c)
	    {
	    	System.out.println("b is greater");
	    }
	    else
	    {
	    	System.out.println("c is greater");
	    }
	    scan.close();
	}

}
