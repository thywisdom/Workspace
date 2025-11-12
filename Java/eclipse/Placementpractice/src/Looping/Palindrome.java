package Looping;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
		String p1=scan.nextLine();
		System.out.println("Enter the String");
		String p2=scan.nextLine();
		
		if(p1.equals(p2))
		{
			System.out.println("Its a palindrome");
		}
		else
		{
			System.out.println("Its not a palindrome");
		}

	}

}
