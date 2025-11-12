package Practicing;

import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the mark");
		int marks=scan.nextInt();
		
		 
	
	    if (marks  > 90)
	    { 
	        System.out.println("excellent");	
	    }
	    else if( marks > 80 && marks<=70)
	    {
	    	System.out.println("good");	
	    }
	    else if( marks > 70 && marks<=60)
	    {
	    	System.out.println("fair");	
	    }
	    else if( marks > 60 && marks<=50)
	    {
	    	System.out.println("meet expectation");
	    }
	    else
	    {
	    	System.out.println("below par");
	    }
	    
	}

} 

   