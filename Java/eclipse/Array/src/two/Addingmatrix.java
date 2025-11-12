package two;

import java.util.Scanner;

public class Addingmatrix {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

        int[][] A = new int[3][3];
        int[][] B = new int[3][3];
        int[][] C = new int[3][3];

        System.out.println("Enter matrix A:");
        for (int i = 0; i < 3; i++) 
            for (int j = 0; j < 3; j++) 
                A[i][j] = scanner.nextInt();

        System.out.println("Enter matrix B:");
        for (int i = 0; i < 3; i++) 
            for (int j = 0; j < 3; j++) 
                B[i][j] = scanner.nextInt();

        System.out.println("Matrix C ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                C[i][j] = A[i][j] + B[i][j];
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();

	}

}
