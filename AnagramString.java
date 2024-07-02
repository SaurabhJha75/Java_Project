import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first String");
		String str1 = sc.nextLine();

		System.out.println("Enter second String");
		String str2 = sc.nextLine();

		if (str1.length() == str2.length()) {

			// converting string into char array
			char strArray1[] = str1.toCharArray();
			char strArray2[] = str2.toCharArray();

			// sort the char array
			Arrays.sort(strArray1);
			Arrays.sort(strArray2);

			// method 1 by using for() loop
			boolean flag = true;

			for (int i = 0; i < strArray1.length; i++) {
				if (strArray1[i] != strArray2[i])
					flag = false;
			}

			if (flag) {
				System.out.println("Anagram");
			} else {
				System.out.println("Not Anagram");
			}
			
			//method 2 by using Arrays.equals() method 
			/*
			 * boolean result = Arrays.equals(strArray1, strArray2);
			 * 
			 * if(result) { System.out.println("Strings are Anagram"); }else {
			 * System.out.println("Strings are not Anagram"); }
			 */
			
		} else {
			System.out.println("Not Anagram");
		}
	}

}
