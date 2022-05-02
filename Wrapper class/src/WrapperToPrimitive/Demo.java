package WrapperToPrimitive;

public class Demo {

	public static void main(String[] args) {
		Integer a=new Integer(3);
		int i=a.intValue();//converting integer to int explicitly
		int j=a; //unboxing
		System.out.println(a+" "+i+" "+j);

	}

}
