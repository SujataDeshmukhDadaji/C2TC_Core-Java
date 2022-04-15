package com.tns.polymorphism;

 class Vehicle {
	 static void run() {
	 System.out.println("vehicle is running...!");
     }
 }
 class Bike extends Vehicle{
	 static void run() {
		 System.out.println("bike is running...!");
	 }
 }

public class MethodOverriding {

	public static void main(String[] args) {
		Vehicle.run();
		Bike.run();

	}

}
