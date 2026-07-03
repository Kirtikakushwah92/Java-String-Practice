package string;

//WAJP to take a String input and check whether the String is a Palindrome String or not(with reversing).


import java.util.Scanner;
public class Program_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		boolean result =checkPalindrome(s);
		System.out.println(result);

	}
	public static boolean checkPalindrome(String s) {
		String reverse =""; String orignal = s;
		for(int i=0;i<s.length();i++){
			char ch = s.charAt(i);
			reverse = ch+reverse;
		}
		return orignal.equals(reverse);
		
	}
	
	

}
