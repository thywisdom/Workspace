package workoutjava;

import java.util.Scanner;

public class Printingname {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=scan.nextLine();
		System.out.println(" Hey " + name + " how are you");
		scan.close();

	}

}
 