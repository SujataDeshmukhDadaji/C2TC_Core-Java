package polymerphism;
class Adder{
	 int add(int a,int b) {
	 return a+b;
	 }
	 double add(float a,int b) {
		 return a+b;
	 
	 
	 }
}

public class methodoverloading {
	 
	public static void main(String[]args) {
		Adder obj= new Adder();
		System.out.println(obj.add(1, 2));
	}

}
