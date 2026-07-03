package string;

//Find-first-palindromic-string-in-the-array


public class Program_14 {

	public static void main(String[] args) {
		String[] s = {"kitik","aabaac","aabaa","efghi"};
		String result = findFirstPalindrome(s);
		System.out.println(result);

	}
	public static String findFirstPalindrome(String[] s) {
		for(int i =0;i<s.length;i++) {
			if(isPalindrome(s[i])) {
				return s[i] ;
			}
			
		}
		return "";
	}
	public static boolean isPalindrome(String s) {
		String reverse =""; String orignal = s;
		for(int i=0;i<s.length();i++){
			char c = s.charAt(i);
			reverse = c + reverse;
		}
		return orignal.equals(reverse);
	}
	
	

}
