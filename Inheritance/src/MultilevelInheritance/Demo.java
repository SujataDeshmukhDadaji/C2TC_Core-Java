package MultilevelInheritance;
class Animal {
	void eat() {
		System.out.println("eating");
	}
}
class Dog extends Animal {
	void bark() {
		System.out.println("barking");
	}
}
class Babydog extends Dog {
	void weep() {
		System.out.println("weeping");
	}
}
public class Demo {

	public static void main(String[] args) {
		Babydog b=new Babydog();
		b.bark();
		b.eat();
		b.weep();

	}

}
