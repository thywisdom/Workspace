package workoutjava;

import java.util.Scanner;

public class Areaofcircle {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the radius");
		int r1=scan.nextInt();
		int r2=scan.nextInt();
		System.out.println(3.14 * (r1*r2));
	}

}
