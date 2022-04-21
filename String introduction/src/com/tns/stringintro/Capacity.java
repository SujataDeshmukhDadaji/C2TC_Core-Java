package com.tns.stringintro;

public class Capacity {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer();
		System.out.println(s.capacity());
		s.append("Hello");
		System.out.println(s.capacity());
		s.append("JAVA IS MY FAVORITE LANGUAGE");//(16*2) + =32+2=34
		System.out.println(s.capacity());

	}

}
