package com.java.interview;

import java.util.Scanner;

public class DuplicateWordFromString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();

		str.toLowerCase();
		String words[] = str.split(" ");

		for (int i = 0; i < words.length; i++) {

			int count = 1;
			for (int j = i + 1; j < words.length; j++) {

				if (words[i].equals(words[j])) {

					count++;
					words[j] = "0";
				}
			}

			if (count > 1 && words[i] != "0") {
				System.out.println(words[i]);
			}
		}
	}
}
