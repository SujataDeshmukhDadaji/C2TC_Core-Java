package com.tns.mi;






 class MM {
	void eat()
	{
		System.out.println("eating...");
	}
}
class Dog extends MM {
	void bark()
	{
		System.out.println("barking...");
	}
}
public class Demo{

	public static void main(String[] args) {
		Dog d=new Dog();
		d.bark();
		d.eat();
		

	}

}
