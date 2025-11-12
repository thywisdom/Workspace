 package workoutjava;

import java.util.Scanner;

public class BasicSalary {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the basic salary: ");
		double salary = scan.nextDouble();
		
		double  total;
		double hra=0;
		double da=0;
		
		if(salary <= 10000) 
		{
          hra=salary*0.20;
          da=salary*0.80;
			
		}
		else if(salary <= 20000)
		{
			hra=salary*0.25;
			da=salary*0.90;
		}
		else if(salary > 20000) 
		{
			hra=salary*0.30;
			da=salary*0.95;
		}
		total=salary+ hra+ da;
		System.out.println("Gross salary is: "+total);
		scan.close();
	}



	}


