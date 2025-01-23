package com.java.interview;

public class SwappingStringWithoutThirdVariable {
	 
	public static void main(String[] args) {
 
		String a = "saurabh", b = "world";
 
		a = a + b;
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());
 
		System.out.println("After swapping : a = " + a + ", b = " + b);
	}
}