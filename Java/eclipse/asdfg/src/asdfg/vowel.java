package asdfg;

import java.util.Scanner;

public class vowel {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a character");
		char a = scan.next().charAt(0); 
		System.out.println(a);
		switch(a){
		
			case'a':
				
			case'e':
				
			case'i':
				
			case'o':
				
			case'u':
				System.out.println("Vowel");
				break;
				
				default:
					System.out.println("Not a vowel");
				
				}
		
	}



	}


