package com.java.interview;

import java.util.HashSet;

import java.util.Scanner;

import java.util.Set;
 
public class RemoveDuplicateFromString {
 
	public static String removeDuplicate(String str) {
 
		char charArray[] = str.toCharArray();
		
		String result = "";
 
		Set<Character> set = new HashSet<Character>();
 
		for (char ch : charArray) {
			
			if (set.add(ch)) {
				result = result + ch;
			}
		}
		
		return result;
	}
 
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string");
		String str = sc.nextLine();
		
		System.out.println("String without duplicate character: " + removeDuplicate(str));
	} 
}
