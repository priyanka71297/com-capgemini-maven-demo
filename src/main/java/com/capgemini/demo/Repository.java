// If both nos are even then product else addition of given nos
package com.capgemini.demo;

import java.util.Scanner;

public class Repository {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number : ");
		int input1 = sc.nextInt();
		
		System.out.println("Enter second number : ");
		int input2 = sc.nextInt();
		
		int res = (input1 % 2 == 0 && input2 % 2 == 0) ? input1 * input2 : input1 + input2;
		
		System.out.println(res);
	}
}
