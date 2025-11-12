package workoutjava;

import java.util.Scanner;

public class Minutescalculate {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("How many hours");
		int hours=scan.nextInt();
		System.out.println("How many minutes");
		int minutes=scan.nextInt();
		int totalMinutes=(hours*60 + minutes);
		System.out.println("Total number of minutes " + totalMinutes);
		
		
		
	}

}
