package com.capgemini.demo;

public class Repository {
	public static void main(String[] args) {
		int a = 10, b = 11;
		int res = (a % 2 == 0 && b % 2 == 0) ? a * b : a + b;
		System.out.println(res);
	}
}
