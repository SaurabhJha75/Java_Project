package com.java.interview;

public class SecondLargestElement {

	public static void main(String[] args) {

		int a[] = { 17, 92, 72, 62, 51, 34, 45 };

		int i, max1, max2;

		if (a[0] > a[1]) {

			max1 = a[0];
			max2 = a[1];

		} else {
			max2 = a[0];
			max1 = a[1];
			{
				for (i = 2; i < a.length; i++) {

					if (a[i] > max1) {

						max2 = max1;
						max1 = a[i];

					} else if (a[i] > max2) {
						max2 = a[i];
					}
				}
			}
		}

		System.out.println("Largest number is: " + max1);
		System.out.println("2nd largest numn: " + max2);
	}
}
