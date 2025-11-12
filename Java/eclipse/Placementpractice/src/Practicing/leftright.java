package Practicing;

import java.util.Scanner;

public class leftright {

	public static void main(String[] args) {


		
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter size of array:");
		        int N = sc.nextInt();
		        int[] arr = new int[N];

		        System.out.println("Enter elements of array:");
		        for (int i = 0; i < N; i++) {
		            arr[i] = sc.nextInt();
		        }

		        int totalSum = 0;
		        for (int num : arr) {
		            totalSum += num;
		        }

		        int leftSum = 0;
		        for (int i = 0; i < N; i++) {
		            totalSum -= arr[i]; 

		            if (leftSum == totalSum) {
		                System.out.print("Equilibrium element found: " + arr[i]);
		                return;
		            }

		            leftSum += arr[i]; 
		        }

		        System.out.print("No equilibrium element found.");
		        sc.close();
		    }
		


	}


