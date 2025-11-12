package asdfg;

import java.util.Scanner;

public class strong {

	
		static int factorial(int n) {
	        int fact = 1;
	        for (int i = 1; i <= n; i++) {
	            fact *= i;
	        }
	        return fact;
	    }
	 static boolean isStrongNumber(int num) {
	        int originalNumber = num;
	        int sum = 0;
	        while (num > 0) {
	            int digit = num % 10;
	            sum += factorial(digit);
	            num /= 10;
	        }
	        return sum == originalNumber;
	    }
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        if (isStrongNumber(number)) {
	            System.out.println(number + " is a strong number.");
	        } else {
	            System.out.println(number + " is not a strong number.");
	        }

	        scanner.close();

	}

}
