package workoutjava;

import java.util.Scanner;

public class Vowelorconstant {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the character:");
		char alpha=scan.next().toLowerCase().charAt(0);
		if(alpha>='a' && alpha<='z')
		{
			if (alpha=='a'||alpha=='e'||alpha=='i'||alpha=='o'||alpha=='u')
			{
			  System.out.println( alpha+"Is vowel");	
			}
			else
			{
				System.out.println(alpha +"Is consonent");
				
			}
		}
		else {
			System.out.println("invaild statement");
		}
        	
scan.close();
	} 

}
