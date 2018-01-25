package Session2.pyramid2;

/*
 * This file contains the class PrintPyramid to print pattern
 */

/**
 * Class contains 3 methods
 * one method returns the string containing spaces
 * one method returns the string containing numbers
 * last method returns the string containing final pyramid
 * @author Amit Kumar Sharma
 *
 */

public class PrintPyramid2 {
	/**
	 * This function returns String of spaces
	 * @param row
	 * @param n
	 * @return
	 */
	String spaces (int row, int n) {
		String s = "";
		for (int i = 1; i < row; i++) {
			s += " ";
		}
		return s;
	}
	
	/**
	 * This function returns String of numbers
	 * @param row
	 * @param n
	 * @return
	 */
	String numbers (int row, int n) {
		String s = "";
		for (int i = 1; i <= (n - row) + 1; i++ ) {
			s += i;
		}
		return s;
	}
	
	/**
	 * This function returns String of final pyramid
	 * @param n
	 * @return
	 */
	String[] print (int n) {
		String s[] = new String[n];
		
		for (int i = 0; i < n; i++) {
			s[i] = ( spaces(i + 1, n) + numbers(i + 1, n) );	//concatenates space and number string 
			System.out.println(s[i]);
		}
		return s;
		
	}
	
}
