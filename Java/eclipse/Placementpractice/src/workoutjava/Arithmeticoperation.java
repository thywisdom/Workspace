package workoutjava;

import java.util.Scanner;

public class Arithmeticoperation {

	public static void main(String[] args) {
	   Scanner scan=new Scanner(System.in);
	   System.out.println("Enter the a value");
	   int a=scan.nextInt();
	   System.out.println("Enter the b value");
	   int b=scan.nextInt();
	   System.out.println("Enter the operation +,-,*,/");
	   char op=scan.next().charAt(0);
	   
	   int result;
	   if(op=='+')
	   {
		   result=a+b;
		   System.out.println("result " + result);
	   }
	   else if(op=='-')
	   {
		   result=a-b;
		   System.out.println("result " + result);
	   }
	   else if(op=='*')
	   {
		   result=a*b;
		   System.out.println("result " + result);
	   }
	   else if(op=='/')
	   {
		   result=a/b;
		   System.out.println("result " + result);
	   }
	   else
	   {
		   System.out.println("Invalid op");
	   }
	   scan.close();
	}

}
