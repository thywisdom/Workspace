package asdfg;

import java.util.Scanner;

public class Quad {

	public static void main(String[] args) {
     int a,b,c,x;
     
     Scanner scan=new Scanner(System.in);
     System.out.println("enter value a");
     a=scan.nextInt();
     System.out.println("enter value b");
     b=scan.nextInt();
     System.out.println("enter value c");
     c=scan.nextInt();
     System.out.println("enter value x");
     x=scan.nextInt();
     System.out.println(a*x*x+b*x+c);

	}

}
