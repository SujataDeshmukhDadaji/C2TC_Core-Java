 package com.tns.polymorphism;

class student{
	public static student s1;
	public static student s2;
	int id;
	String name;
	student() 
	{
		System.out.println("I am a student");
	}
	student(int id,String name) {
		this.id=id;
		this.name=name;
		System.out.println(id + " " + name);
		
	}
}

public class ConstructorOverloading {

	private static final int Sujata=0;

	public static void main(String[] args) {
		student.s1 = new student();
		student.s2 = new student();

	}

}
