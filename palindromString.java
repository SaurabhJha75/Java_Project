import java.util.Scanner;

public class palindromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a String");
		String str = sc.next();
		
		//method 3 by using creating separate method
		/*
		 * if(isPalindrom(str)) { System.out.println(str+ " is a palindrom"); } else {
		 * System.out.println(str+ " is not a palindrom"); }
		 */

		// method 1 by using for() loop
		int i = 0;
		int j = str.length() - 1;
		
		boolean flag = true;

		while (i <= j) {
			
			if (str.charAt(i) != str.charAt(j))
				flag = false;
			
				i++;
				j--;
		}

		if (flag)
			System.out.println("Palindrom");
		else {
			System.out.println("Not Plaindrom");
		}
		
		//method 2 by using reverse() method
		/*
		 * StringBuilder sb = new StringBuilder(); sb.append(str);
		 * 
		 * String revStr = sb.reverse().toString();
		 * 
		 * if(str.equals(revStr)) { System.out.println("Palindrom"); }else {
		 * System.out.println("Not Palindrome"); }
		 */
	}
	
	
	// Using method to check the string 
	/*
	 * public static boolean isPalindrom(String str) { // TODO Auto-generated method
	 * stub int i=0, j = str.length()-1;
	 * 
	 * while( i<=j ) {
	 * 
	 * if(str.charAt(i) != str.charAt(j)) return false;
	 * 
	 * i++; j--; }
	 * 
	 * return true; }
	 */
}
