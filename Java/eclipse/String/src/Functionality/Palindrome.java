package Functionality;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		

		
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a string: ");
		        String input = scanner.nextLine();
		        System.out.println(isPalindrome(input) ? "Palindrome" : "Not a palindrome");
		        
		    }
		    
		    public static boolean isPalindrome(String str) {
		        str = str.toLowerCase();
		        return new StringBuilder(str).reverse().toString().equals(str);
		    }
		

	}


