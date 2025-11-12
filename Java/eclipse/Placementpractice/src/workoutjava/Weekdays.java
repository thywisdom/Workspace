package workoutjava;

import java.util.Scanner;

public class Weekdays {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the day(1-7)");
		int num=scan.nextInt();
		
		if(num==1)
		{
			System.out.println("Monday");
		}
		else if(num==2)
		{
			System.out.println("Tuesday");
		}
		else if(num==3)
		{
			System.out.println("Wednesday");
		}
		else if(num==4)
		{
			System.out.println("Thursday");
		}
		else if(num==5)
		{
			System.out.println("Friday");
		}		
		else if(num==6)
		{
			System.out.println("Saturday");
		}
		else if(num==7)
		{
			System.out.println("Sunday");
		}
		else
		{
			System.out.println("Invalid number");
		}
		
		scan.close();
		
		
		
		
		
		
		
		
		
		/*String a="Divyanshu Gupta",b="";
    	for(char d:a.toCharArray())
    	{
    		if(!b.contains(d+""))
    		{
    			b=b+d;
    		}
    	}
    	System.out.println(b);*/

	}

}
