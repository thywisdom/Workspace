package workoutjava;

import java.util.Scanner;

public class CalculatePercentagesub {

	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter the Phycics mark:");
		 int Physics=scan.nextInt();
		 System.out.println("Enter the Chemistry mark:");
		 int Chemistry=scan.nextInt();		
		 System.out.println("Enter the Biology mark:");
		 int Biology=scan.nextInt();
		 System.out.println("Enter the Mathmetics mark:");
		 int Mathmetics=scan.nextInt();
		 System.out.println("Enter the Computerscience mark:");
		 int Computerscience =scan.nextInt();
		 
		 int totalmarks=Physics+Chemistry+Biology+Mathmetics+Computerscience;
		 double percentage=totalmarks/5;
		 char grade;
		 
		 if(percentage>=90)
		 {
			  grade='A';
		 }
		 else if(percentage>=80)
		 {
			 grade='B';
		 }
		 else if(percentage>=70)
		 {
			 grade='C';
		 }	
		 else if(percentage>=60)
		 {
			 grade='D';
		 }
		 else if(percentage>=40)
		 {
			 grade='E';
		 }
		 else
		 {
			 grade='F';
		 }
		 
		 System.out.println("totalmarks :" + totalmarks);
		 System.out.println("Percentage :" + percentage + "% ");
		 System.out.println("Grade :" + grade);
	}    

}
