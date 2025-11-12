package workoutjava;

import java.util.Scanner;

public class ProfitLoss {

	public static void main(String[] args) {
		  /*Scanner scan=new Scanner(System.in);
		  System.out.println(); 
		  int a=scan.nextInt();
		  
		  if(a>=1000)
		  {
			  System.out.println("Profit");
		  }
		  else
		  {
			  System.out.println("Loss");
		  }
		  scan.close();*/
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the cost price: "); 
		double cp=scan.nextDouble();
		System.out.println("Enter the selling price: "); 
		double sp=scan.nextDouble();
		
		if(sp>cp)
		{
			double Price=sp-cp;
			System.out.println(Price + " is profit");
		}
		else if(cp>sp)
		{
			double Price=cp-sp;
			System.out.println(Price + " is loss");
		}
		else
		{
			System.out.println(" Both are equal");
		}
		scan.close();
	}

}
