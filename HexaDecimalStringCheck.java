package com.java.stream;

import java.util.Scanner;

public class HexaDecimalStringCheck {

	public static boolean isHexaDecimalCharacter(char ch) {

		return ((ch >= 'A' && ch <= 'F') || (ch >= 'a' && ch <= 'f'));

	}

	public static boolean isHexaDecimal(String str) {
		if (str == null || str.isEmpty()) {
			return false;
		}

		char chars[] = str.toCharArray();

		for (char ch : chars) {
			if (!Character.isDigit(ch) && !isHexaDecimalCharacter(ch)) {
				return false;
			}
		}

		return true;

	}

	public static void main(String[] args) {
	// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");

		String str = sc.nextLine();

		if (isHexaDecimal(str)) {
			System.out.println(str + " is Hexadecimal.");
		} else {
			System.out.println(str + " is not a Hexadecimal.");
		}

	}

}
