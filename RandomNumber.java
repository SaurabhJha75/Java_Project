package com.java.interview;

import java.util.concurrent.ThreadLocalRandom;

public class RandomNumber {
 
	public static void main(String[] args) {
 
		int min = 10, max = 30;
		int range = max - min + 1;
 
		int random = (int) (Math.random() * range);
		System.out.println("Random value: " + random);
 
		int randomNumber = ThreadLocalRandom.current().nextInt(min, max + 1);
		System.out.println("Random value between " + min + " and " + max + " is : " + randomNumber);
	}
}

 