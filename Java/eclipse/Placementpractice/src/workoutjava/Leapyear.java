package workoutjava;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        System.out.println("Enter the year");
        int year=scan.nextInt();
        
        if(year%4==0 && year%100!=0 )
        {
        	System.out.println("The " + year + " is leap year");
        }
        else
        {
        	System.out.println("The " + year + " is not a leap year");
        }
        scan.close();
	}

}
