package Functionality;

import java.util.Scanner;

public class Strongweek {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a password: ");
        String password = scan.nextLine();
        
        if (password.length() >= 8 && 
            password.matches(".*[A-Z].*") && 
            password.matches(".*[a-z].*") && 
            password.matches(".*\\d.*") && 
            password.matches(".*[@#$%^&*!].*")) 
        {
            System.out.println("Strong Password ");
        } 
        else 
        {
            System.out.println("Weak Password ");
        }
	
	
	
	
	
	}
	  }
		