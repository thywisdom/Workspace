package workoutjava;

import java.util.Scanner;

public class Divisable511 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		

		if(num %5 == 0 && num %11 ==0) 
		{
			System.out.println("The number is divisible by 5 and 11");
		}
		else
		{
           System.out.println("IT IS NOT DIVISIBLE");
	}
          scan.close();

	
	}
	
	}
