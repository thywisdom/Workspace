package two;

import java.util.Scanner;

public class Sumofarray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Get the size of the array
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        // Create an array
        int[] numbers = new int[size];
        int sum = 0;

        // Get elements from the user
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i]; // Add elements to sum
        }

        // Display the sum
        System.out.println("Sum of elements: " + sum);}
}

   