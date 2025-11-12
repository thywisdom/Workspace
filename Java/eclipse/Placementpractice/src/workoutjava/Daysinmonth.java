package workoutjava;

import java.util.Scanner;
  
public class Daysinmonth {

	public static void main(String[] args) {
		/*Scanner scan=new Scanner(System.in);
		System.out.println("Enter the month in number");
		int month=scan.nextInt();
		
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
		{
			System.out.println("These month is having 31 Days");
		}
		else if(month==4||month==6||month==9||month==11)
		{
			System.out.println("These month is having 30 Days");
		}
		else if(month==2)
		{
			System.out.println("This month is having 28 Days");
		}
		else
		{
			System.out.println("These month is having invalid number");
		}*/
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value");
		int a=scan.nextInt();
		
		switch(a)
		{
		case 1,3,5,7,9,11:
			System.out.println("31 Days");
		break;
		case 4,6,8,10,12:
			System.out.println("30 Days");
		break;
		case 2:
			System.out.println("28 or 29 Days");
			break;
			default:
				System.out.println("Invalid Number");
				break;
		
		}
		scan.close();
		}
		}
			


