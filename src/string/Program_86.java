package string;
//125. Valid Palindrome in string
//Input: s = "A man, a plan, a canal: Panama"
//Output: true
//Explanation: "amanaplanacanalpanama" is a palindrome.

//Convert uppercase letters to lowercase.
//Ignore/remove non-alphanumeric characters.
//Check whether the remaining characters are the same forward and backward.

//A better approach is often the two-pointer technique:
//
//A man, a plan, a canal: Panama
//↑                             ↑
//left                         right
import java.util.Scanner;
import java.util.Stack;
public class Program_86 {

	public static void main(String[] args) {
	
		String s = "A man, a plan, a canal: Panama";
		boolean res=validPalindrome(s);
		System.out.println(res);
		

	}
	public static boolean validPalindrome(String s) {
		int left = 0; int right = s.length()-1;
		while(left<right) {
			while(left<right && !Character.isLetterOrDigit(s.charAt(left))) {
				left++;
			}
			while(left<right && !Character.isLetterOrDigit(s.charAt(right))) {
				right--;
			}
			if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
				return false;
			}
			left++;right--;
		}
		return true;
	}
	

}
