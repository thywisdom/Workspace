  gfpackage workoutjava;

import java.util.Scanner;

public class Electricity {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the total electricity units");
		int units = scan.nextInt();
		double Total;
		
		if(units>=0 && units<=50)
		{
			Total =units*0.5;
		}
		else if(units>=51 && units<=150) 
		{
			Total =(50*0.5)+(units-50)*.75;
			}
		else if(units>=151 && units<=250)
		{
			Total = (50*0.5)+(units-150)*1.20+(100.75);
		}
		else {
			Total = (50*0.5)+(units-250)*1.50+(100.75)+(100*1.20);
		}
		Total = Total+(Total*0.2);
		System.out.println("The total cost is "+Total);
		scan.close();

	}


	}


