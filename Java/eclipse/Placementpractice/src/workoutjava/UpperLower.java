package workoutjava;

import java.util.Scanner;

public class UpperLower {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Letter");
	    char ch = scan.next().charAt(0);
		
		if(Character.isUpperCase(ch))  
		{
			System.out.println( ch + " is uppercase");
		}
		else if(Character.isLowerCase(ch))
		{
			System.out.println( ch + " is LowerCase");
		}
		else
		{
			System.out.println( ch + " Invalid");
		}
		scan.close();
	}

}
