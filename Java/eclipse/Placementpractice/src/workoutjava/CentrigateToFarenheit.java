package workoutjava;

import java.util.Scanner;

public class CentrigateToFarenheit {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of c");
		double c=scan.nextInt();
		System.out.println("Celcius to Farenheit " + ( c* 9/5+32));
	
		

	}

}
