package Functionality;

import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println(removeDuplicates(sc.nextLine()));
        sc.close();
    }

    public static String removeDuplicates(String str) {
        StringBuilder res = new StringBuilder();
        for (char c : str.toCharArray()) if (res.indexOf(c + "") == -1) res.append(c);
        return res.toString();
    }
}