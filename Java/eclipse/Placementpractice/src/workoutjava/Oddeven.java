package workoutjava;

import java.util.Scanner;

public class Oddeven {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value ");
		int a=scan.nextInt();
		
		if(a%2==0)
		{
			System.out.println("The number is EVEN");
		}
		else
		{	
System.out.println("The number is ODD");
}
	scan.close();	
	}}
