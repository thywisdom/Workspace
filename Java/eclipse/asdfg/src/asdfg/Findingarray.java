package asdfg;

import java.util.Scanner;

public class Findingarray {
   public static void main(String[] args) {
		int [] a=new int[5];
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array");
		for(int i=0; i<5; i++) {
			a[i]=scan.nextInt();
		}
		System.out.println("Enter the number");
		int c=0;
		int b=scan.nextInt();
		for(int i:a) {
			if(i==b) {
				c++;
			}
		}
		if(c!=0) {
			System.out.println("The number is Present & the count is :" + c);
		}
		else {
			System.out.println("Not present");
		}
   }}