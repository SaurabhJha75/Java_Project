import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String");
		String str = sc.next();
		
		//method 1 by using reverse() method of StringBuilder
		/*
		 * StringBuilder sb = new StringBuilder(); sb.append(str);
		 * 
		 * StringBuilder revStr = sb.reverse();
		 * 
		 * System.out.println("Reverse String is: " +revStr.toString());
		 */
		
		//method 2 by using for loop and empty string
		String revStr = "";
		char ch;
		
		for(int i=0;i<str.length();i++) {
			ch = str.charAt(i);
			revStr = ch+revStr;
		}
		
		System.out.println("Reverse String is: "+revStr);
		
		//method 3 by usnig char array
		/*
		 * char revStr[] = str.toCharArray();
		 * 
		 * System.out.println("Reverse String is: "); for(int i=revStr.length -
		 * 1;i>=0;i--) System.out.print(revStr[i]);
		 */
		
	}

}
