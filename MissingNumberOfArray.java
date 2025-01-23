package com.java.interview;

public class MissingNumberOfArray {
 
	public static void main(String[] args) {
 
		int arr[] = new int[] { 1, 2, 6, 9, 5, 4, 7, 3 };

		int N = 9;
		int expectedSum = (N * (N + 1)) / 2;
		int numSum = 0;
 
		for (int i : arr) {
			numSum = numSum + i;
		}
 
		System.out.println("Missing number is: " + (expectedSum - numSum));
	}
}

 
