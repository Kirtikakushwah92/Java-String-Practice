package string;

//WAJP to take a String input and check whether the String is a Palindrome String or not(without reversing).


import java.util.Scanner;
public class Program_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		boolean result =checkPalindrome(s);
		System.out.println(result);

	}
	public static boolean checkPalindrome(String s) {
		char[] c = s.toCharArray();
		int start = 0;
		int end = c.length-1;
		while(start<end) {
			if(c[start] == c[end]) {
				start++; end--;
			}
			else {
				return false;
			}
		}
		return true;
		
	}
	
	

}
