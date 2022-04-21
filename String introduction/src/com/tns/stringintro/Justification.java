package com.tns.stringintro;

public class Justification {

	public static void main(String[] args) {
		//immutable
		String s1 = "Study";
		s1.concat("Night");
		System.out.println("The string output is:" +s1);

		
		//Mutable
		StringBuffer s3 = new StringBuffer("Study");
		s3.append("Night");
		System.out.println("The stringBuffer output:" +s3);
				

	}

}
