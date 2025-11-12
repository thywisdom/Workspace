package Looping;

import java.util.Scanner;

public class Powerofanumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the base value");
		int base=scan.nextInt();
		System.out.println("Enter the power value");
		int power=scan.nextInt();
		
		int result=1;
		for(int i=1;i<=power;i++)
		{
			result=base*result;
		}

		System.out.println(result);
	}

}
