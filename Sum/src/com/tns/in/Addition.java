package com.tns.in;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		int a;
		int b;
		int sum;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number");
		a=sc.nextInt();
		b=sc.nextInt();
		sum=a+b;
		System.out.println("The sum of numbers" + sum);

	}

}
