import java.util.Scanner;

public class ReverseString {

	//method to reverse the string by using reverse() method
	public static String revString(String str) {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(str);
		sb.reverse();
		
		return sb.toString();
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the first string: ");
		String str1 = sc.next();

		//method 1 
		String str2 = " ";
		char ch;
		for (int i = str1.length() - 1; i >= 0; i--) {
			ch = str1.charAt(i);
			str2 = str2 + ch;
		}
		System.out.println("Reversed String is: " + str2);

		//method 2 by using stringBuilder
		/*
		 * String reverseString = revString(str1); System.out.println(reverseString);
		 */

	}
}
