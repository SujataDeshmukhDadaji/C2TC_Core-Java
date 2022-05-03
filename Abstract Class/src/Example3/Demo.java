package Example3;
abstract class Bank {
	abstract int rateofintrest();
}
class SBI extends Bank {
	int rateofintrest( ) {
		return 7;
	}
}
class HDFC extends Bank {
	int rateofintrest() {
		return 8;
	}
}
	public class Demo {

	public static void main(String[] args) {
		SBI s=new SBI();
		HDFC h=new HDFC();
		h.rateofintrest();
		System.out.println("The rate of intrest in SBI"+s.rateofintrest());
		System.out.println("The rate of intrest in HDFC"+h.rateofintrest());
		

	}

}
